!SLIDE

# ClojureScript editors

!SLIDE

## You can do a lot with console figwheel and editor with Clojure support

!SLIDE

## Not many editors with great ClojureScript REPL support

!SLIDE

- Vim (kind of)
- Emacs
- Cursive


!SLIDE

# Vim
## Needs piggieback

    @@@ bash
    9000
    (starts basic browser repl)

    @@@ bash
    (cljs.repl.node/repl-env)
    (starts basic node repl)
!SLIDE

# Emacs

    @@@ lisp
    (defun cljs-node-repl ()
      (interactive)
        (run-clojure "java -cp cljs.jar clojure.main repl.clj"))

!SLIDE small

# Cusrive
- Click __Run->Edit__ configurations.
- Click the `+` button at the top left and choose **Clojure REPL**
- Choose a **Local REPL**
- Enter a name in the **Name** field (e.g. "REPL")
- Choose the radio button **Use clojure.main in normal JVM process**
- In the **Parameters** field put `script/repl.clj`
- Click the **OK** button to save your REPL config.
