;; namespace clj-tac-toe
(ns cljiktaktoe.core
  (:gen-class))

;; public static int[][] new-grid = [[0,0,0],[0,0,0],[0,0,0]];
(def new-grid [[0 0 0]
               [0 0 0]
               [0 0 0]])

;; /* (int, int) étant un tuple */
;; public array[][] playMove(string[][] grid, string player, (int, int) move){
;;   int x = move[0];
;;   int y = move[1];
;;   string[][] outputGrid = grid.clone();
;;   outputGrid[y][x] = player;
;;   return outputGrid;
;; }

(defn play-move
  "Play a player's move in the tic-tac-toe grid"
  [grid player move]
  (let [x (- (first move) 1)
        y (- (second move) 1)]
    (assoc grid y (assoc (grid y) x player))))


;; public string getWinningPlayer(board){
;;   return x;
;; }

(defn winner-p
;; TODO: Actualy find out who wins. Will return X until this is done
  "Find out which player is winning between X and O"
  [grid]
  'x)

(defn next-move
;; TODO: Prompt user for their move
  "Ask the next player to play a move"
  [player]
  (println "Je fais rien live"))

;; public string gridToPrintableString(string[] row)
;;   return (String) row[0] + | + row[1] + | + row[2]
;; }
(defn grid-line-string
  "Transform a grid line into a string"
  [grid line]
  (str
   (nth (grid line) 0)
   "|"
   (nth (grid line) 1)
   "|"
   (nth (grid line) 2)))


;;  public string gridToString(string[][] grid){
;;    constant versitalCeparator = ""\n------\n";
;;    return gridToPrintable(grid[0]) + verticalSeparator + gridToPrintable(grid[1]) + verticalSeparator +gridToPrintable(grid[2]) + v
;;    erticalSeparator
;;  }
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

;; public void printGrid(strng[][] grid){
;;   string grid-str = gridToString(grid);
;;   system.out.printLn(grid-str);
;; }
(defn print-grid
  "Print the current tictactoe game state"
  [game-grid]
  (let [grid-str (format-grid game-grid)]
    println grid-str))

;; public static void main(string argsjit){
;;   string[][] gameGrid = new-grid.clone();
;;   while (getWinningPlayer(gameGrid) == null) {
;;     /**
;;     Logique pour faire que chaques joueurs joue un move.
;;     Normalement on assigne le ouput d'un move de jouer à gameGrid et ou le repasse dans
;;     getWinningPlayer pour savoir quand le jeux est terminé
;;     **/
;;   }
;;   system.out.println(and the winner is getWinningPlayer(0))
;;   main()  (Fonction récursiv qui se recall lorsque la game est fini*)
;; }

(defn game-loop
;; TODO: Implement turn-based game flow
  "Ask the next player to input a move until there is a winner"
  []
  (loop [game-game new-grid]
    (cond (not winner-p game-grid)
          (recur n (inc d) f))))  (while (not winner-p)
                                    :else (winner-p)
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
                                      (println "Welcome to tic-tac-toe!")
                                      (new-game))
