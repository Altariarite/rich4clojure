(ns rich4clojure.easy.problem-022
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Count a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which returns the total number of
;; elements in a sequence.

(def restricted [count])

(def __ :tests-will-fail)

(comment
   (#(loop [coll % l 0]
    (if (empty? coll) 
    l
    (recur (rest coll) (inc l))  ) ) [1 2 3 4])
  )

(tests
  (#(loop [coll % l 0]
       (if (empty? coll)
         l
         (recur (rest coll) (inc l))))  '(1 2 3 3 1)) := 5
  (#(loop [coll % l 0]
       (if (empty? coll)
         l
         (recur (rest coll) (inc l)))) "Hello World") := 11
  (#(loop [coll % l 0]
       (if (empty? coll)
         l
         (recur (rest coll) (inc l))))  [[1 2] [3 4] [5 6]]) := 3
  (#(loop [coll % l 0]
       (if (empty? coll)
         l
         (recur (rest coll) (inc l))))  '(13)) := 1
  (#(loop [coll % l 0]
       (if (empty? coll)
         l
         (recur (rest coll) (inc l))))  '(:a :b :c)) := 3)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/d55eddc37d7a08a3440748ddb75c7ec4