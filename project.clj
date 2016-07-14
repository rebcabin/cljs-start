(defproject cljs-start "0.2.0"
  :description "Sample starting project for ClojureScript REPL"

  :license  {:name "Eclipse Public License"
             :url "http://www.eclipse.org/legal/epl-v10.html"}

  :clean-targets ^{:protect false}  ["resources/public/js" "resources/brwoser_repl" "resources/node_repl"]

  :source-paths  ["src/main"]

  :jvm-opts ^:replace  ["-Xmx1g" "-server"]

  :dependencies  [[org.clojure/clojure "1.8.0"]
                  [org.clojure/clojurescript "1.9.89"]
                  [org.clojure/tools.nrepl "0.2.11"]
                  [figwheel-sidecar "0.5.4-7"]
                  [binaryage/devtools "0.7.2"]
                  [binaryage/dirac "0.6.2"]
                  [reply "0.3.7"]])
