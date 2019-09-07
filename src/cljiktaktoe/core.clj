(ns cljiktaktoe.core
  (:gen-class))

(def new-grid [[1 0 0]
               [2 0 0]
               [3 0 0]])

(defn play-move
  "Play a player's move in the tic-tac-toe grid"
  [grid player move]
  (let [x (- (first move) 1)
        y (- (second move) 1)]
    (assoc grid y (assoc (grid y) x player))))

(play-move new-grid 'x [3 3])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, tic-tac-toe!"))


