(ns periodical.tasks
  (:require [periodical.handlers :as handlers]
            [environ.core :refer [env]]))

(def print-task
  {:id "print-task"
   :handler handlers/print-handler
   ;:schedule "0 /15 * * * * *"
   :schedule "/2 * * * * * *"
   :opts {:publication "new-statesman" :type "rss-feed"}})