(ns triples.core-test
  (require [triples.core :refer :all]))

(def st1 (->semtriple 1 2 3))

(println ::hi! x)
(println st1)
(doseq [item st1]
  (println item))
