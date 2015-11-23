(ns periodical.core
  (:gen-class)
  (:use [cronj.core])
  (:require [periodical.schedulers :as schedulers]))

(defn -main [& args]
  (println "Starting periodical...")
  (start! schedulers/cj))
