(defproject cljiktaktoe "0.1.0-SNAPSHOT"
  :description "Command-line Tic-tac-toe game."
  :license {:name "GPL-3.0"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot cljiktaktoe.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
