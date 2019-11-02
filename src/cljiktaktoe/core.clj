(ns cljiktaktoe.core
  (:gen-class))

(def *new-grid* [[1 0 0]
                 [2 0 0]
                 [3 0 0]])

(defn play-move
  "Play a player's move in the tic-tac-toe grid"
  [grid player move]
  (let [x (- (first move) 1)
        y (- (second move) 1)]
    (assoc grid y (assoc (grid y) x player))))

;; TODO: Actualy find out who wins. Will return X until this is done
(defn winner-p
  "Find out which player is winning between X and O"
  [grid]
  'x)

;; TODO: Prompt user for their move
(defn next-move
  "Ask the next player to play a move"
  [player]
  (println "Je fais rien live"))

(defn grid-line-string
  "Transform a grid line into a string"
  [grid line]
  (str
   (nth (grid line) 0)
   "|"
   (nth (grid line) 1)
   "|"
   (nth (grid line) 2)))

(defn format-grid
  "Transform the tictactoe grid into a printable string"
  [grid]
  (let [vertical-separator "\n-----\n"]
    (->
     (str (grid-line-string grid 0))
     (str vertical-separator)
     (str (grid-line-string grid 1))
     (str vertical-separator)
     (str (grid-line-string grid 2)))))

(defn print-grid
  "Print the current tictactoe game state"
  [game-grid]
  (let [grid-str (format-grid game-grid)]
    println grid-str))

;; TODO: Implement turn-based game flow
(defn game-loop
  "Ask the next player to input a move until there is a winner"
  []
  "x")

;; ->> Is a thread-last macro. The output of the other function
;; is given as the last argument to the next function
(defn new-game []
  (->>
   (game-loop)
   (str "And the winner is:\n")
   (println)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (new-game))
