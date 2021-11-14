(ns rich4clojure.elementary.problem-156
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Map Defaults =
;; By 4Clojure user: jaycfields
;; Difficulty: Elementary
;; Tags: [seqs]
;; 
;; When retrieving values from a map, you can specify
;; default values in case the key is not found:
;; 
;; 
;; (= 2 (:foo {:bar 0, :baz 1} 2))
;; 
;; 
;; However, what if you want the map itself to contain
;; the default values? Write a function which takes a
;; default value and a sequence of keys and constructs a
;; map.

(def __ :tests-will-fail)

(comment
  (for [x [1 2 3] m {}]
    (assoc m x 0))
  ;; => ({1 0} {2 0} {3 0})
  (empty? '())
  
  (loop [x [1 2 3]
         m {}]
    (if (empty?   x)
      m
      (recur (rest x) (assoc m (first x) 0))))

  (into {} '({1 0} {2 0} {3 0}))
  ;; => {1 0, 2 0, 3 0}

  (#(into {} (for [x %2]
               {x %1})) 0 [:a :b :c])
  ;; => ({:a 0} {:b 0} {:c 0})

  )

(tests
  (#(into {} (for [x %2]
               {x %1})) 0 [:a :b :c]) := {:a 0 :b 0 :c 0}
  (#(into {} (for [x %2]
               {x %1})) "x" [1 2 3]) := {1 "x" 2 "x" 3 "x"}
  (#(into {} (for [x %2]
               {x %1})) [:a :b] [:foo :bar]) := {:foo [:a :b] :bar [:a :b]})

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/4e79a8389a4687b2564262b46785d45a