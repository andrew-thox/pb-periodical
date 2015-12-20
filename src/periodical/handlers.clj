(ns periodical.handlers
  (:require [environ.core :refer [env]]))

(def acquistion-url (clojure.string/replace "http://:host/acquisitions/:publication/:type" #":host" (env :acquistion-host)))

(defn print-handler [t opts]
  (let [url (clojure.string/replace acquistion-url #":publication|:type" {":publication" (:publication opts) ":type" (:type opts)})]
    (println t "-" url)))