(ns periodical.handlers)

(defn print-handler [t opts]
  (println (:output opts) ": " t))