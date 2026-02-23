---

### Stage 5: `README.md`
```markdown
# Tic-Tac-Toe AI - Stage 5: Unbeatable "Hard" AI (Minimax)

## Description
The final stage of the project implements the `hard` difficulty level, transforming the AI into an undefeated champion. This is achieved using the **Minimax algorithm**, a recursive brute-force algorithm that evaluates the entire game tree.



## Key Features
* **Perfect Gameplay:** The AI looks multiple moves ahead, assuming the opponent is also playing perfectly. It will always choose a path that guarantees a win or forces a draw.
* **Complete System:** Users can now mix and match all levels (`user`, `easy`, `medium`, `hard`) through the main menu loop.

## Example Output
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
...