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