(ns repl.dirac
  (:require
    [dirac.runtime :as dirac]
    [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)
(dirac/install!)

(println "Browser REPL with Dirac and devtools extensions")