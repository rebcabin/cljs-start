(require 'cljs.repl)
(require 'cljs.build.api)
(require 'cljs.repl.node)

(cljs.build.api/build
  "src/node"
  {:target :nodejs
   :output-to "resources/node_repl/main.js"
   :output-dir "resources/node_repl"
   :verbose true})

(cljs.repl/repl
  (cljs.repl.node/repl-env)
  :watch "src/node"
  :output-dir "resources/node_repl")
