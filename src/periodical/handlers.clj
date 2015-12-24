(ns periodical.handlers
  (:require [environ.core :refer [env]]
            [clj-http.client :as client]
            [periodical.log :as log]))

(def acquistion-url (clojure.string/replace "http://:host/acquisitions/:publication/:type" #":host" (env :acquistion-host)))

(defn acquistion-handler [t opts]
  (let [url (clojure.string/replace acquistion-url #":publication|:type" {":publication" (:publication opts) ":type" (:type opts)})]
    (log/info t "- checking " url " for new articles")
    (client/get url)))