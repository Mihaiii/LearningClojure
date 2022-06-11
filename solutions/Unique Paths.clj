(defn unique-paths
  [x y]
  (if (= x 1)
    1
    (if (= y 1)
      1
      (+ (unique-paths (dec x) y) (unique-paths x (dec y))))))
(time (unique-paths 17 13))
;"Elapsed time: 1407.7039 msecs"
;30421755

; taken from: https://github.com/m0wfo/clojure-dynamic/blob/4e5730eabb809fee95d81cce17e61dbfaf93869d/src/main/clojure/com/mowforth/dynamic/fib.clj
; not yet clear how exactly it applies memoization.
(defn top-down [x y]
  (with-redefs [unique-paths (memoize unique-paths)]
    (unique-paths x y)))

(time (top-down 17 13))
;"Elapsed time: 0.6861 msecs"
;30421755