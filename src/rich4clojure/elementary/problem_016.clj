(ns rich4clojure.elementary.problem-016
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Hello World =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; Write a function which returns a personalized greeting.

(def __ :tests-will-fail)

(comment
 (format "Hello, %s" "x")
  
  (#(format "Hello, %s" % ) "x")
  )

(tests
  (#(format "Hello, %s!" % ) "Dave") := "Hello, Dave!"
  (#(format "Hello, %s!" % ) "Jenn") := "Hello, Jenn!"
  (#(format "Hello, %s!" % ) "Rhea") := "Hello, Rhea!")

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/60e1accc59d5c5783365ab46d47eb78b