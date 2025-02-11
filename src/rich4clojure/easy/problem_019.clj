(ns rich4clojure.easy.problem-019
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Last Element =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which returns the last element in a
;; sequence.

(def restricted [last])

(def __ :tests-will-fail)

(comment
  (first (reverse [1 2 3 4 5]))
  )

(tests
  (#(first (reverse %)) [1 2 3 4 5]) := 5
  (#(first (reverse %)) '(5 4 3)) := 3
  (#(first (reverse %)) ["b" "c" "d"]) := "d")

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/374c499f3dad0203503b7dae16bf86f4