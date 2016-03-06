(ns start.core
  (:require  [devtools.core :as devtools]))

(devtools/enable-feature! :sanity-hints)
(devtools/install!)

(defn foo  [a b]
  (+ a b))
