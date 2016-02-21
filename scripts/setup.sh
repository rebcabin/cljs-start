#!/bin/sh

set -e

echo "Downloading ClojureScript"
curl -L https://github.com/clojure/clojurescript/releases/download/r1.7.228/cljs.jar > lib/cljs.jar
echo "Library setup complete"
