---

### Stage 4: `README.md`
```markdown
# Tic-Tac-Toe AI - Stage 4: "Medium" AI

## Description
This stage introduces a new difficulty level: `medium`. The AI stops relying entirely on random chance and begins to exhibit strategic awareness by looking one move ahead.

## Key Features
* **Winning Move Detection:** If the AI has two pieces in a row and can win on the current turn, it will take the winning spot.
* **Blocking Move Detection:** If the opponent has two pieces in a row and is about to win, the AI will block the opponent's winning cell.
* **Fallback Logic:** If neither a win nor a block is available, the AI falls back to making a random move.

## Example Output
```text
Input command: > start medium user
---------
|       |
|       |
|       |
---------
Making move level "medium"
---------
|       |
|       |
|   X   |
---------
Enter the coordinates: > 2 2
...