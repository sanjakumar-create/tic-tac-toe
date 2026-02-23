

# Tic-Tac-Toe with AI (Java)

## Overview
A fully featured, command-line Tic-Tac-Toe game written in Java. This project demonstrates the evolution of a simple Player vs. Player game into a complex application featuring multiple game modes, input validation, and an unbeatable AI opponent powered by the **Minimax algorithm**. 

By building this project in stages, it highlights progressive software engineering principles, moving from basic state management to complex algorithmic decision-making.

## Features
* **Multiple Game Modes:** Play Player vs. Player, Player vs. AI, or watch AI vs. AI simulations.
* **Customizable Matches:** Configure matchups dynamically via a robust CLI menu.
* **Progressive AI Difficulty:**
    * `easy`: Executes randomized valid moves.
    * `medium`: Utilizes heuristic logic to prioritize immediate winning moves or block opponent threats.
    * `hard`: Implements the Minimax algorithm to evaluate the entire game tree, ensuring the AI plays flawlessly and never loses.

## Tech Stack
* **Language:** Java
* **Concepts Demonstrated:** Object-Oriented Design, State Management, Recursive Algorithms (Minimax), CLI Parsing, Exception Handling.

## How to Run
1. Ensure you have Java installed on your machine.
2. Compile the source code: 
   ```bash
   javac tictactoe/Main.java

```

3. Run the program:
```bash
java tictactoe.Main

```



## Available Commands

The game operates via a continuous main menu loop.

* `start <player1> <player2>`: Begins a game. Replace parameters with `user`, `easy`, `medium`, or `hard`. (Player 1 plays as X and goes first, Player 2 plays as O).
* *Example:* `start user hard` (You play X, unbeatable AI plays O)
* *Example:* `start easy easy` (Watch two easy AIs play against each other)
* *Example:* `start user user` (Local human multiplayer)


* `exit`: Terminates the application.

---

## Project Evolution & Technical Breakdown

This project was built incrementally across 5 stages, each adding a new layer of complexity to the application architecture.

### Stage 1: Core Game Logic

Established the foundational mechanics of the game. It implements the standard 3x3 grid, processes human player inputs, and manages the fundamental game loop for local Player vs. Player (PvP) matches.

* **State Management:** Maintains and updates the 2D array representing the game board after each turn.
* **Input Parsing & Validation:** Processes standard input (stdin) to extract coordinate data, ensuring users enter valid integers within the grid boundaries and preventing moves on already occupied cells.
* **Terminal Condition Detection:** Implements logic to continuously evaluate the board state, accurately detecting horizontal, vertical, and diagonal win conditions, as well as draw states.

### Stage 2: Basic AI Agent ("Easy")

Introduced automated gameplay by implementing the first computer opponent. The application transitioned from a purely PvP model to supporting Player vs. Environment (PvE) matches against an "easy" level AI.

* **Randomized Decision Making:** The AI utilizes a pseudorandom number generator to calculate its moves, dynamically selecting from available empty coordinates on the grid.
* **Game Loop Automation:** The central game loop was updated to handle autonomous turns without pausing for standard input.

### Stage 3: CLI Menu & Game Modes

Refactored the application architecture to include a continuous Command-Line Interface (CLI) menu loop, providing a robust routing system to configure match parameters dynamically.

* **Dynamic Entity Assignment:** Users can pass arguments to define player roles (`user`, `easy`), allowing for varying configurations including AI vs. AI simulation matches.
* **Exception & Error Handling:** Protects the application state against malformed inputs or invalid arguments, returning a structured `Bad parameters!` error and gracefully recovering to the main menu.

### Stage 4: Heuristic AI Strategy ("Medium")

Upgraded the AI capabilities by shifting from pure randomness to utilizing heuristic evaluations, allowing it to exhibit basic strategic awareness.

* **Offensive Threat Detection (Winning Move):** Prioritizes immediate victory by scanning the board for configurations where two of its own pieces align, claiming the third cell to win the game.
* **Defensive Threat Detection (Blocking Move):** Analyzes the opponent's potential next moves, actively blocking cells where the opponent is one turn away from achieving a win condition.
* **Fallback Protocol:** If no immediate offensive or defensive actions are required, the algorithm defaults to standard randomized play.

### Stage 5: Algorithmic AI ("Hard" / Minimax)

The final stage implemented an unbeatable `hard` difficulty level. By integrating the **Minimax algorithm**, the AI simulates and evaluates the entire game tree. It assumes optimal play from the opponent, ensuring the AI never loses and will always force a win or a draw.

* **Recursive State Evaluation:** Utilizes Minimax to recursively simulate all possible future board states down to the terminal nodes.
* **Score Maximization/Minimization:** The algorithm assigns quantitative values to end states (+10 for an AI win, -10 for an opponent win, 0 for a draw), propagating these scores back up the game tree to select the mathematically optimal move.

---

### Example Gameplay

```text
Input command: > start hard user
---------
|       |
|       |
|       |
---------
Making move level "hard"
---------
|       |
| X     |
|       |
---------
Enter the coordinates: > 2 2
---------
|       |
| X O   |
|       |
---------
Making move level "hard"
---------
|   X   |
| X O   |
|       |
---------

```


```
