(ns rich4clojure.elementary.problem-134
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = A nil key =
;; By 4Clojure user: goranjovic
;; Difficulty: Elementary
;; Tags: [maps]
;; 
;; Write a function which, given a key and map, returns
;; true iff the map contains an entry with that key and
;; its value is nil.

(def __ :tests-will-fail)

(comment
  (#(nil? (%1 %2)) :a {:a nil :b 2})

  (contains? {:a nil} :a)
  ;; => true
  (fn f [key map] (or (contains? map key) (key map)))
  (f :c {:a nil :b 2})
  ;; => nil

  (f :b {:a nil :b 2})
  ;; => true

  )

(tests
  ((fn f [key map] (or (contains? map key) (key map))) :a {:a nil :b 2}) :=
  ((fn f [key map] (or (contains? map key) (key map))) :b {:a nil :b 2}) :=
  ((fn f [key map] (or (contains? map key) (key map))) :c {:a nil :b 2}) :=)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/70ba70e1e4e0f249a90bc99bda5f8aff