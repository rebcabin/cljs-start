(defproject cljs-start "0.1.0-SNAPSHOT"
  :description "Sample starting project for ClojureScript REPL"

  :license  {:name "Eclipse Public License"
             :url "http://www.eclipse.org/legal/epl-v10.html"}

  :clean-targets ^{:protect false}  ["resources/public/js" "resources/brwoser_repl" "resources/node_repl"]

  :source-paths  ["src/main"]

  :jvm-opts ^:replace  ["-Xms512m" "-Xmx512m" "-server"]

  :dependencies  [[org.clojure/clojure "1.7.0"]
                  [org.clojure/clojurescript "1.7.228"]
                  [com.cemerick/piggieback "0.2.1"]
                  [org.clojure/tools.nrepl "0.2.11"]
                  [figwheel-sidecar "0.5.0-6"]]

  :profiles  {:browser {:source-paths ["src/browser"]
                        :repl-options  {:nrepl-middleware  [cemerick.piggieback/wrap-cljs-repl]}}
              :node  {:source-paths ["src/node"]
                      :repl-options  {:nrepl-middleware  [cemerick.piggieback/wrap-cljs-repl]
                                      :init (require 'cljs.repl.node)}}})
