(ns start.core
  (:require [clojure.browser.repl :as repl]))

(defonce conn
  (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(defn foo  [a b]
  (+ a b))

(println "Hello World")
