(defproject org.clojars.ninjudd/clojure "1.2.0"
  :description "The Clojure programming language"
  :aot [:exclude clojure.parallel]
  :aot-test [clojure.test-clojure.protocols.examples clojure.test-clojure.genclass.examples]
  :main clojure.main
  :jar-classpath "."
  :jar-files [["src/clj/clojure/version.properties" "clojure/version.properties"]]
  :java-compile {:includejavaruntime true :target "1.5"})
