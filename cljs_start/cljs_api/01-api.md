!SLIDE

# ClojureScript Building Blocks

!SLIDE

# Compilation functions
## Just normal clojure functions
## Covered in [ClojureScript Quick Start](https://github.com/clojure/clojurescript/wiki/Quick-Start)

!SLIDE

## cljs.build.api/build

    @@@ clojure
    (cljs.build.api/build
      "src"
      {:main "core.start"
       :output-to "out/app.js"})
- Takes a ClojureScript source directory and map of options
- One shot compilation to JavaScript

!SLIDE

## cljs.build.repl/repl

    @@@ clojure
    (cljs.repl/repl
      (cljs.repl.browser/repl-env)
      :watch "src"
      :output-to "out/app.js")
- Takes a REPL environment and option key value pairs
- Recompiles anytime files in the `:watch` directory change

!SLIDE

## cljs.build.api/inputs

    @@@ clojure
    (cljs.build.api/inputs "src/main" "src/dev" "foo/bar.cljs")

- Allows multiple directories / files
- Can be used in place of `"src"`
- ClojureScript is compiled in order listed

!SLIDE

## Compilation and Repl options

!SLIDE

    @@@@ clojure
    :optimizations :none

- Repl development option
- Doesn't bring in Google Closure Compiler

!SLIDE

    @@@@ clojure
    :output-to "out/app.js"

- Location of the compiled JavaScript file

!SLIDE

    @@@@ clojure
    :main "my.awesome.project"

- Used for browser development
- No additional setup beyond loading :output-to file
- Entry point namespace
- Seven degrees of ClojureScript dependencies

!SLIDE

    @@@@ clojure
    :target :nodejs

- Compile ClojureScript for node
- Brings in extra functionality for node development

!SLIDE

    @@@@ clojure
    :output-dir "out"

- Where compilation files are to be stored
- Main files entourage
- Cache files, source maps, JavaScript files

!SLIDE bullets

    @@@@ clojure
    :asset-path "js"

so that "http://localhost/js" points to "./resources/public/js"

!SLIDE

    @@@@ clojure
    :source-map true

- Universal translator from JavaScript
- Allows you to debug in host language

!SLIDE

    @@@@ clojure
    :verbose true

- Shows compilation information while compiling
- Helpful for debugging

!SLIDE

    @@@@ clojure
    :watch "src"

- Repl development option
- Recompile when any file in this directory changes

!SLIDE

    @@@@ clojure
    :repl-verbose true

- Repl development option
- Shows compiled JavaScript before returning result
- Learning how compilation works

!SLIDE

# From this

    @@@ clojure
    #{1 2}

!SLIDE

# To this

    @@@ javascript
    new cljs.core.PersistentHashSet(null,
                                    new cljs.core.PersistentArrayMap(null, 2, [(1),null,(2),null], null),
                                    null)
