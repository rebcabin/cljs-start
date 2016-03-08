# Starting with ClojureScript

## Optional third party tools

`rlwrap`, a tool that makes command line repls more usable, called with `rlwrap <repl command>`

`node` server side JavaScript, this will allow you to run a repl without starting a browser

## Starting without a build tool

### Setup

Run `scripts/setup.sh`, this downloads the ClojureScript jar file. This is needed to run the base repls.

### Node repl

Run `scripts/base_node_repl.sh`. This runs the following command `java -cp lib/*:src/node clojure.main build/node_repl.clj`

### Browser repl

Run `scripts/base_browser_repl.sh`. This runs the following command  `java -cp lib/*:src/browser clojure.main build/browser_repl.clj`
Connect the repl by going to http://localhost:9000

## Starting with a build tool

### Setup

Run `lein deps` to install the tools for the figwheel, cljs-dev-tools, and dirac repls

### FigWheel repl

Run `scripts/figwheel_repl.sh`. This runs the following command `lein with-profile +figwheel run -m clojure.main build/figwheel_repl.clj`

### FigWheel repl with CLJS Dev tools

Run `scripts/devtools_repl.sh`. This runs the following command `lein with-profile +devtools run -m clojure.main build/devtools_repl.clj`
CLJS Devtools  functionality only works with Chrome / Chromium  devtools

### FigWheel repl with Dirac

This needs the [Dirac Chrome Extenstion](https://chrome.google.com/webstore/detail/dirac-devtools/kbkdngfljkchidcjpnfcgcokkbhlkog://chrome.google.com/webstore/detail/dirac-devtools/kbkdngfljkchidcjpnfcgcokkbhlkogi)

You'll need to start the browser like so `<Chrome Chromium> --remote-debugging-port=9222`

Run `scripts/dirac_repl.sh`. This runs the following command `lein with-profile +dirac repl`
After the repl has started run the following code in it to start the ClojureScript REPL
``` clojure
(require 'cljs.repl)
(require 'cljs.repl.browser)

(cljs.repl/repl
  (cljs.repl.browser/repl-env)
  :main 'start.core
  :watch "src/browser"
  :output-dir "resources/browser_repl"
  :output-to "resources/browser_repl/main.js")
```

Connect the repl by going to http://localhost:9000
