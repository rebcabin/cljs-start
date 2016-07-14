(println "Loading requirements")
(require '[figwheel-sidecar.repl-api :as ra]
         '[clojure.tools.nrepl.server :as s]
         '[dirac.nrepl :as dn]
         '[dirac.agent :as da]
         '[reply.main :as reply])
; Figwheel configuration
(println "Starting Figwheel")
(ra/start-figwheel!
  {:figwheel-options  {}
   :build-ids  ["dev"]
   :all-builds
   [{:id "dev"
     :figwheel true
     :source-paths  ["src/main"]
     :compiler  {:preloads '[repl.dirac]
                 :main 'repl.core
                 :asset-path "js"
                 :output-to "resources/public/js/app.js"
                 :output-dir "resources/public/js"
                 :source-map true
                 :verbose true}}]})
; Figwheel autobuild
(println "Autobuilding with figwheel")
(ra/start-autobuild)
; Dirac NRepl setup
(def port 8230)
(println "Setting up NRepl with dirac middleware")
(defonce server (s/start-server :port port :handler (s/default-handler #'dn/middleware)))
; Start Dirac Agent
(println "Starting Dirac Agent")
(def dirac-booted (da/boot!))
; Start Dirac Repl
(future
  @dirac-booted
  (println "Starting Dirac Repl")
  (-> {:color true :skip-default-init true} (assoc :attach (str "localhost" ":" port)) reply/launch-nrepl)
  (System/exit 0))