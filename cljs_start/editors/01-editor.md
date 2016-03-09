!SLIDE

# ClojureScript editors

!SLIDE

# You can do a lot with figwheel and editor with Clojure support

!SLIDE

# Not many editors with great ClojureScript REPL support

!SLIDE

- Vim (kind of)
- Emacs
- Cursive

!SLIDE

# Vim
## Clojure Plugins
- piggieback

## Plugins
- [Vim Fireplace](https://github.com/tpope/vim-fireplace)
- [Vim Clojure Static](https://github.com/guns/vim-clojure-static)

!SLIDE

## Browser Repl

    @@@ bash
    :Piggieback 9000

## Node Repl

    @@@ bash
    :Piggieback (cljs.repl.node/repl-env)

!SLIDE

# Emacs Plugins

- inf-clojure.
- exec-path-from-shell (for node on OSX)

!SLIDE

# Repl Setup

    @@@ lisp
    (defun cljs-node-repl ()
      (interactive)
        (run-clojure "java -cp cljs.jar clojure.main repl.clj"))

!SLIDE small

# Cusrive (from Figwheel wiki)
- Click __Run->Edit__ configurations.
- Click the `+` button at the top left and choose **Clojure REPL**
- Choose a **Local REPL**
- Enter a name in the **Name** field (e.g. "REPL")
- Choose the radio button **Use clojure.main in normal JVM process**
- In the **Parameters** field put `script/repl.clj`
- Click the **OK** button to save your REPL config.
