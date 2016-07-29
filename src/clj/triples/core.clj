(ns triples.core)

(def x 100)

(defrecord semtriple [subj pred obj])

(defn semtriple-str
  [st]
  (str "\n" ::semtriple
       "\n   " :subj " " (:subj st)
       "\n   " :pred " " (:pred st)
       "\n   " :obj " " (:obj st)
       ))

(defmethod print-method semtriple
  [semtriple writer]
  (print-simple (semtriple-str semtriple) writer))

