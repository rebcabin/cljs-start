# Starting with ClojureScript

## Optional third party tools

`rlwrap`, a tool that makes command line repls more usable, called with `rlwrap <repl command>`

`node` server side JavaScript, this will allow you to run a repl without starting a browser

## Starting without a build tool                                                                                I

### Setup

Run `scripts/setup.sh`, this downloads the ClojureScript jar file. This is needed to run the base repls.
Run `lein deps` to install the tools for the figwheel, cljs-dev-tools, and dirac repls


### Node repl

Run `scripts/base_node_repl.sh`. This runs the following command `java -cp lib/*:src/node clojure.main build/node_repl.clj`

### Browser repl

Run `scripts/base_browser_repl.sh`. This runs the following command  `java -cp lib/*:src/browser clojure.main build/browser_repl.clj`
