(ns start.core
  (:require  [devtools.core :as devtools]))

(devtools/install! [:custom-formatters :sanity-hints])

(defn foo  [a b]
  (+ a b))
