(require '[figwheel-sidecar.repl :as r]
         '[figwheel-sidecar.repl-api :as ra])

(ra/start-figwheel!
  {:figwheel-options  {}
   :build-ids  ["dev"]
   :all-builds
   [{:id "dev"
     :figwheel true
     :source-paths  ["src/devtools"]
     :compiler  {:preloads '[repl.devtools]
                 :main 'repl.core
                 :asset-path "js"
                 :output-to "resources/public/js/app.js"
                 :output-dir "resources/public/js"
                 :verbose true}}]})

(ra/cljs-repl)
