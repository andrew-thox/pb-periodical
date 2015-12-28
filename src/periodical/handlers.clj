(ns periodical.handlers
  (:require [abracad.avro :as avro]
            [environ.core :refer [env]]
            [clj-http.client :as client]
            [periodical.log :as log]
            [periodical.publish :as publish]
            [periodical.schemas :as schemas]))

(def acquistion-url (clojure.string/replace "http://:host/acquisitions/:publication/:type" #":host" (env :acquistion-host)))

(defn acquistion-handler [t opts]
  (let [publication (:publication opts)
        method (:method opts)
        source (or (:source opts) "default")
        payload [publication method source]]
    (log/info t "- checking for new articles - " payload)
    (client/get "http://hchk.io/42d1786e-c01e-4dcb-ba1c-7a328b99a031")
    (publish/publish-task (->> payload (avro/binary-encoded schemas/task-schema)))))

