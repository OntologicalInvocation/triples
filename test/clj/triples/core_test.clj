(ns triples.core-test
  (require [triples.core :refer :all]))

(def st1 (->semtriple 1 2 3))

(def s1 #{
  (->semtriple :man :isa :mortal)
  (->semtriple :Socrates :isa :man)})

(println ::hi! x)
(println st1)
(doseq [item st1]
  (println item))
