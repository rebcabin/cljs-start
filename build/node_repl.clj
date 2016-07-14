(require 'cljs.repl)
(require 'cljs.build.api)
(require 'cljs.repl.node)

(cljs.build.api/build
  "src/main"
  {:target :nodejs
   :preloads '[repl.node]
   :main 'repl.core
   :output-to "resources/node_repl/main.js"
   :output-dir "resources/node_repl"
   :verbose true})

(cljs.repl/repl
  (cljs.repl.node/repl-env)
  :preloads '[repl.node]
  :watch "src/main"
  :output-dir "resources/node_repl")
