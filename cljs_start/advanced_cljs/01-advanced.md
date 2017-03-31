!SLIDE

# Barcalounge Development
## Need build tools for this

!SLIDE

# [Figwheel](https://github.com/bhauman/lein-figwheel)
## The development tool you didn't know you wanted

!SLIDE

# Figwheel gives you

- Live code reloading
- Live css reloading
- Only loads correct minimal code
- Robust connection

!SLIDE

# As lein plugin

    @@@ clojure
    [lein-figwheel "0.5.9"]

# As library

    @@@ clojure
    [figwheel-sidecar "0.5.9"]

!SLIDE

    @@@ clojure
    (require '[figwheel-sidecar.repl-api :as ra])

    (ra/start-figwheel!
      {:figwheel-options  {}
       :build-ids  ["dev"]
       :all-builds
       [{:id "dev"
         :figwheel true
         :source-paths  ["src/figwheel"]
         :compiler  {:main 'start.core
                     :asset-path "js"
                     :output-to "resources/public/js/app.js"
                     :output-dir "resources/public/js"
                     :verbose true}}]})

    (ra/cljs-repl)

!SLIDE

## Added bonus
- have repl running on the command line
- make changes in favorite editor via code reloading

!SLIDE

# Debugging ClojureScript in browser

!SLIDE

![Base ClojureScript Data Structure Display](../../images/base_cljs_inspect_object.png)

!SLIDE

![Base ClojureScript Dev Tools Display](../../images/devtools_cljs_inspect_object.png)

!SLIDE

## [CLJS Devtools](https://github.com/binaryage/cljs-devtools)

    @@@ clojure
    [binaryage/devtools "0.9.2"]

- Gives much better presentation of ClojureScript values
- More informative exceptions
- Only works with chrome devtools

!SLIDE

    @@@ clojure
    (ns start.core
      (:require  [devtools.core :as devtools]))

    (devtools/enable-feature! :sanity-hints)
    (devtools/install!)

!SLIDE

# We can do even better!

!SLIDE bullets incremental

# [Dirac](https://github.com/binaryage/dirac)

    @@@ clojure
    [binaryage/dirac "1.2.3"]

- Repl with Paninfer in devtools console
- even inside a breakpoint
- inline custom formatters during debugging
- Marco properties are grouped and have friendly names

!SLIDE

# But
- Needs chrome  [extension](https://chrome.google.com/webstore/detail/dirac-devtools/kbkdngfljkchidcjpnfcgcokkbhlkogi)
- Needs cljs-devtools
- Launch chrome with remote debug port
- Nrepl with dirac middleware
- Dirac agent

!SLIDE

    @@@ clojure
    (ns start.core
      (:require  [devtools.core :as devtools]))

    (devtools/enable-feature! :dirac)
    (devtools/install!)

!SLIDE

    @@@ bash
    <chrome or chromium> \
      --remote-debugging-port=9222

!SLIDE

## Lein options

    @@@ clojure
    :repl-options
      {:port 8230
       :nrepl-middleware [dirac.nrepl.middleware/dirac-repl]
       :init (do
               (require 'dirac.agent)
               (dirac.agent/boot!))}}
