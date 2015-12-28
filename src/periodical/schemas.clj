(ns periodical.schemas
  (:require [abracad.avro :as avro]))

(def task-schema
  (avro/parse-schema
   {:type :record
    :name "LongList"
    :aliases ["LinkedLongs"]
    :fields [{:name "outlet", :type "string"}
             {:name "acquisition-method", :type "string"}
             {:name "acquisition-source", :type ["string", :null]}]}))