(set-env!
  :dependencies '[[org.clojure/clojure                       "1.9.0-alpha10"  :scope "provided"]
                  [adzerk/boot-test                          "1.1.2"         :scope "test"]
                  [org.clojure/core.async                    "0.2.385"]]
 ; :source-paths #{"src/clj" "test/clj"}
  )

(require
  '[adzerk.boot-test            :refer :all])

(deftask test-it
   "Setup, compile and run the tests."
   []
   (comp
     (run-tests :namespaces '#{
                                 })))
