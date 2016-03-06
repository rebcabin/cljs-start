(ns start.core
  (:require  [devtools.core :as devtools]))

(devtools/enable-feature! :sanity-hints :dirac)
(devtools/install!)

(def state  (atom  []))

(defn simple-fn  [count]
  (let  [rng  (range count)]
    (doseq  [item rng]
      (let  [s  (str "item=" item)]
        (swap! state conj s)))))
