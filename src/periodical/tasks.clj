(ns periodical.tasks
  (:require [periodical.handlers :as handlers]))

(def print-task
  {:id "print-task"
   :handler handlers/print-handler
   :schedule "/2 * * * * * *"
   :opts {:output "Hello There"}})