# Tic-Tac-Toe with AI (Java)

## Overview
A fully featured, command-line Tic-Tac-Toe game written in Java. This project demonstrates the evolution of a simple Player vs. Player game into a complex application featuring multiple game modes, input validation, and an unbeatable AI opponent powered by the **Minimax algorithm**.

## Features
* **Multiple Game Modes:** Play Player vs. Player, Player vs. AI, or watch AI vs. AI simulations.
* **Customizable Matches:** Configure matchups dynamically via a robust CLI menu (e.g., `start user hard`, `start easy easy`).
* **Progressive AI Difficulty:**
    * `easy`: Executes randomized valid moves.
    * `medium`: Utilizes heuristic logic to prioritize immediate winning moves or block opponent threats.
    * `hard`: Implements the Minimax algorithm to evaluate the entire game tree, ensuring the AI plays flawlessly and never loses.



## Tech Stack
* **Language:** Java
* **Concepts Demonstrated:** Object-Oriented Design, State Management, Recursive Algorithms (Minimax), CLI Parsing, Exception Handling.

## How to Run
1. Ensure you have Java installed.
2. Compile the source code: `javac tictactoe/Main.java`
3. Run the program: `java tictactoe.Main`

## Available Commands
* `start <player1> <player2>`: Begins a game. Replace parameters with `user`, `easy`, `medium`, or `hard`. (Player 1 is X, Player 2 is O).
* `exit`: Terminates the application.
