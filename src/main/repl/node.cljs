(ns repl.node
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn -main  [& args]
  (println "Node Main Function"))

(set! *main-cli-fn* -main)

(println "Node REPL started")
