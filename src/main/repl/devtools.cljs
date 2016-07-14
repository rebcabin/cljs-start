(ns repl.devtools
  (:require  [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install! [:custom-formatters :sanity-hints])

(println "Browser REPL with CLJS Devtools up and running")