(ns start.core
  (:require
    [dirac.runtime :as dirac]
    [devtools.core :as devtools]))

(devtools/install!)
(dirac/install!)

(def state  (atom  []))

(defn simple-fn  [count]
  (let  [rng  (range count)]
    (doseq  [item rng]
      (let  [s  (str "item=" item)]
        (swap! state conj s)))))
