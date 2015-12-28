(ns periodical.publish
  (:require [environ.core :refer [env]]
            [langohr.core :as rmq]
            [langohr.basic :as lb]
            [langohr.channel :as lch]))

(defn publish-task [task]
  (let [conn  (rmq/connect {:uri (env :amqp-url)})
        ch    (lch/open conn)]
    (lb/publish ch "" (env :queue-name)
      task
      {:content-type "avro/binary"
       :type "task"
       :source "periodical.scheduler"})
    (rmq/close ch)
    (rmq/close conn)))
