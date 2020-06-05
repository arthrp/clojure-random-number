(defproject random-number "0.1.0-SNAPSHOT"
  :description "Guess random number from 1 to 10"
  :url "https://github.com/arthrp/clojure-random-number"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot random-number.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
