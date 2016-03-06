(ns start.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn -main  [& args]
    (println "Hello world!"))

(defn foo  [a b]
  (+ a b))

(set! *main-cli-fn* -main)
