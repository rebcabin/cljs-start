(require 'cljs.repl)
(require 'cljs.build.api)
(require 'cljs.repl.browser)

(cljs.build.api/build
  "src/main"
  {:preloads '[repl.browser]
   :main 'repl.core
   :output-to "resources/browser_repl/main.js"
   :output-dir "resources/browser_repl"
   :verbose true})

(cljs.repl/repl
  (cljs.repl.browser/repl-env)
  :main 'main.core
  :watch "src/main"
  :output-dir "resources/browser_repl"
  :output-to "resources/browser_repl/main.js")
