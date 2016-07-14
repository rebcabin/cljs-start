(ns repl.core)

(defn foo  [a b]
  (+ a b))

; Demo function for Dirac
(defn breakpoint-demo [count]
  (let [numbers (range count)]
    (doseq [number numbers]
      (let [is-odd? (odd? number)
            line (str "number " number " is " (if is-odd? "odd" "even"))]
        (js-debugger)
        (println line)))))