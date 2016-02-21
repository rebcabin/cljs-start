# Starting with ClojureScript

## Optional third party tools

`rlwrap`, a tool that makes command line repls more usable, called with `rlwrap <repl command>`

`node` server side JavaScript, this will allow you to run a repl without starting a browser

## Starting without a build tool                                                                                I

### Setup

Run `scripts/setup.sh`, this downloads ClojureScript and tooling for development

### Node repl

Run `scripts/base_node_repl.sh`. This runs the following command `java -cp lib/cljs.jar:src clojure.main build/node_repl.clj`
