(ns first-clojure-project.core
  (:gen-class))

(defn mult2 [x] (* x 2))

(defn mult-square [x] 
	(* x (+ 2 x)))

(defn pow3 [x]
	(* x (Math/pow 2 x)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
