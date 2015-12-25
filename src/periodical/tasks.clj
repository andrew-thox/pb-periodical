(ns periodical.tasks
  (:require [periodical.handlers :as handlers]
            [environ.core :refer [env]]))

(def acquistion-task
  {:id "new-statesman-rss-reader"
   :handler handlers/acquistion-handler
   :schedule "0 /15 * * * * *"
   ;:schedule "/30 * * * * * *"
   :opts {:publication "new-statesman" :type "rss-feed"}})