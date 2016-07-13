(println "Loading requirements")
(require '[figwheel-sidecar.repl-api :as ra]
         '[clojure.tools.nrepl.server :as s]
         '[dirac.nrepl :as dn]
         '[dirac.agent :as da])
; Figwheel configuration
(println "Starting Figwheel")
(ra/start-figwheel!
  {:figwheel-options  {}
   :build-ids  ["dev"]
   :all-builds
   [{:id "dev"
     :figwheel true
     :source-paths  ["src/dirac"]
     :compiler  {:main 'start.core
                 :asset-path "js"
                 :output-to "resources/public/js/app.js"
                 :output-dir "resources/public/js"
                 :source-map true
                 :verbose true}}]})
; Figwheel autobuild
(println "Autobuilding figwheel")
(ra/start-autobuild)
; Dirac NRepl setup
(println "Setting up NRepl with dirac middleware")
(defonce server (s/start-server :port 8230 :handler (s/default-handler #'dn/middleware)))
; Start Dirac Agent
(println "Starting Dirac Agent")
(da/boot!)