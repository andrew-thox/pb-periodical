(defproject periodical "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [im.chit/cronj "1.4.1"]
                 [environ "0.5.0"]
                 [clj-http "2.0.0"]
                 ;logging
                 [org.clojure/tools.logging "0.3.1"]
                 [ch.qos.logback/logback-classic "1.1.3"]
                 [me.moocar/logback-gelf "0.12"]
                 ;avro
                 [com.damballa/abracad "0.4.13"]
                 ;queue
                 [com.novemberain/langohr "3.0.0-rc2"]]
  :plugins [[lein-environ "1.0.1"]]
  :main ^:skip-aot periodical.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
