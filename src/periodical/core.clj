(ns periodical.core
  (:gen-class)
  (:use [cronj.core])
  (:require [periodical.schedulers :as schedulers]
            [periodical.log :as log]))

(defn -main [& args]
  (println "Starting periodical...")
  ;(log/debug "Test debug log")
  ;(log/info "Test info log")
  ;(log/error "Test error log")
  ;(try (throw (Exception. "JUST A TEST. DON'T PANIC."))
  ;     (catch Exception e (log/error e"Test exception logging")))
  ;(println "^^^ This exception was expected."))
  (start! schedulers/cj))
