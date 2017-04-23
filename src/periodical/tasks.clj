(ns periodical.tasks
  (:require [periodical.handlers :as handlers]
            [environ.core :refer [env]]))

(def acquistion-tasks [
	{
		:id "new-statesman-rss-reader"
		:handler handlers/acquistion-handler
   		;:schedule "0 /15 * * * * *"
   		:schedule "/30 * * * * * *"
   		:opts {:publication "new-statesman" :method "rss-feed"}}
   		{
		:id "evening-standard-rss-reader"
		:handler handlers/acquistion-handler
   		;:schedule "0 /15 * * * * *"
   		:schedule "/30 * * * * * *"
   		:opts {:publication "evening-standard" :method "rss-feed"}}])