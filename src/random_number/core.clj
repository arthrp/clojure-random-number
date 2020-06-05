(ns random-number.core
  (:gen-class))

(defn check-input [true-num]
  (def userinput (Integer/parseInt(read-line)))
  (if (= userinput true-num)
    (println "You guessed")
    (if (> userinput true-num)
      (println "Too high")
      (println "Too low")))
)

(defn get-number []
  (Math/round (rand 10))
)

(defn -main
  [& args]
  (def target (get-number))
  (println "Input number from 1 to 10:")
  (check-input target))
