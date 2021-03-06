(defproject clojuregoat "0.1.0-SNAPSHOT"
            :description "a goat, in Clojure"
            :url "https://github.com/ThoughtWorksInc/clojuregoat"
            :min-lein-version "2.0.0"
            :dependencies [[javax.servlet/servlet-api "2.5"]
                           [org.clojure/clojure "1.6.0"]
                           [compojure "1.3.3"]
                           [http-kit "2.1.5"]
                           [de.ubercode.clostache/clostache "1.4.0"]]
            :main main
            :aot :all
            :uberjar-name "clojuregoat.jar"
            :profiles {:dev
                       {:dependencies [[ring-mock "0.1.5"]
                                       [midje "1.6.3" :exclusions [org.clojure/clojure]]]
                        :plugins      [[lein-midje "3.1.3"]]}})
