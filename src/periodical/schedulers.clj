(ns periodical.schedulers
  (:use [cronj.core])
  (:require [periodical.tasks :as tasks]))

(def cj (cronj :entries [tasks/print-task]))