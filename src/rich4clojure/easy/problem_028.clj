(ns rich4clojure.easy.problem-028
  (:require [hyperfiddle.rcf :refer [tests]])
  (:require [clojure.string :as str]))

;; = Flatten a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which flattens a sequence.

(def restricted [flatten])

(def __ :tests-will-fail)

(comment
  (loop [coll [1 [2 3] [4]]
         res []]
        (cond
          (empty? coll) res
          (list)
          ))

  (str/split "helllo world" #" ")
  
  (tree-seq sequential? seq [1 2])

  (defn checkMagazine [magazine note]
    (let [words (into #{} (clojure.string/split magazine #" "))
          notes (into #{} (clojure.string/split note #" "))
          belongs (clojure.set/subset? notes words)]
          (if belongs "Yes" "No")))
)


(tests
  (__ '((1 2) 3 [4 [5 6]])) := '(1 2 3 4 5 6)
  (__ ["a" ["b"] "c"]) := '("a" "b" "c")
  (__ '((((:a))))) := '(:a))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/0c6e3c48cac7434882ca4b2c71ebfce1