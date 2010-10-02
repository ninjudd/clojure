(defproject clojure "1.3.0-SNAPSHOT"
  :description "The Clojure programming language"
  :aot [:exclude clojure.parallel]
  :main clojure.main
  :jar-classpath "."
  :jar-files [["src/clj/clojure/version.properties" "clojure/version.properties"]]
  :java-compile {:includejavaruntime true :target "1.5"})

