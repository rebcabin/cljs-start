!SLIDE

## Basic ClojureScript setup

Download [ClojureScript](https://github.com/clojure/clojurescript/releases/download/r1.7.228/cljs.jar) standalone jar

[rlwrap](http://utopia.knoware.nl/~hlub/uck/rlwrap/)  makes base command line repl much more usable

!SLIDE bullets transition=slideUp

- Benefits
  - Very Portable
  - Better understanding of ClojureScript
  - Less fragile

!SLIDE transition=fade

# One line of bash
    @@@ bash
    java -cp cljs.jar:<cljs dir> repl.clj

!SLIDE small transition=fade

# Node Setup

    @@@ clojure
    (require 'cljs.repl)
    (require 'cljs.build.api)
    (require 'cljs.repl.node)

    (cljs.build.api/build
      "src/node"
      {:target ':nodejs
       :output-to "node_repl/app.js"
       :verbose true})

    (cljs.repl/repl
      (cljs.repl.node/repl-env)
      :watch "src/node"
      :output-dir "node_repl")


!SLIDE small transition=fade

# Browser Setup ClojureScript Side

    @@@ clojure
    (ns start.core
      (:require [clojure.browser.repl :as repl]))

    (defonce conn
      (repl/connect "http://localhost:9000/repl"))

!SLIDE small transition=fade

# Browser Setup

    @@@ clojure
    (require 'cljs.repl)
    (require 'cljs.build.api)
    (require 'cljs.repl.browser)

    (cljs.build.api/build
      "src/browser"
      {:main 'start.core
       :output-to "browser_repl/main.js"
       :output-dir "browser_repl"
       :verbose true})

    (cljs.repl/repl
      (cljs.repl.browser/repl-env)
      :watch "src/browser"
      :output-dir "browser_repl"
      :output-to "browser_repl/main.js")