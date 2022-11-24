(ns core
  (:require
    [buddy.core.codecs :as codecs])
  (:import
    org.bouncycastle.jcajce.provider.digest.SHA3$DigestSHA3))


(defn main
  []
  (let [md (SHA3$DigestSHA3. 256)
        _ (.update md (codecs/hex->bytes "0ccdf1e0217221deb8d807c1ecdf9c0c00beffbc339cdfa5c203c1a022d9cf01"))
        digest (.digest md)]
    (println (codecs/bytes->hex digest))))
