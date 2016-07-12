(require 'cljs.repl)
(require 'cljs.build.api)
(require 'cljs.repl.browser)

(cljs.build.api/build
  "src/dirac"
  {:main 'start.core
   :asset-path "js"
   :output-to "resources/public/js/app.js"
   :output-dir "resources/public/js"
   :optimizations :none
   :source-map true
   :verbose true})
