# Starting with ClojureScript

## Running Presentation

Install [showoff](https://github.com/puppetlabs/showoff) with this command `bundle install`

After showoff has been install run `showoff serve`

and then navigate to `localhost:9090`

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

### Node repl

Run `scripts/base_node_repl.sh`. This runs the following command `java -cp lib/*:src/node clojure.main build/node_repl.clj`

### Browser repl

Run `scripts/base_browser_repl.sh`. This runs the following command  `java -cp lib/*:src/browser clojure.main build/browser_repl.clj`
Connect the repl by going to http://localhost:9000

### FigWheel repl

Run `scripts/figwheel_repl.sh`. This runs the following command `lein run -m clojure.main build/figwheel_repl.clj`
Connect the repl by going to http://localhost:3449

### FigWheel repl with CLJS Dev tools

Run `scripts/devtools_repl.sh`. This runs the following command `lein run -m clojure.main build/devtools_repl.clj`
CLJS Devtools functionality only works with Chrome / Chromium devtools
Connect the repl by going to http://localhost:3449

### FigWheel repl with Dirac

This needs the [Dirac Chrome Extenstion](https://chrome.google.com/webstore/detail/dirac-devtools/kbkdngfljkchidcjpnfcgcokkbhlkog://chrome.google.com/webstore/detail/dirac-devtools/kbkdngfljkchidcjpnfcgcokkbhlkogi)

You'll need to start the browser like so `<Chrome Chromium> --remote-debugging-port=9222`

Run `scripts/dirac_repl.sh`. This runs the following command `lein run -m clojure.main build/dirac_repl.clj`
This repl also sets up an nrepl connection at port `8230`
To connect to the dirac repl from the command line or from an nrepl connection you need to run the command `(diarc! :join)`
Connect the repl by going to http://localhost:3449 and then clicking on dirac devtools extension.
