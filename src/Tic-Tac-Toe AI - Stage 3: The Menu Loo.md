---

### Stage 3: `README.md`
```markdown
# Tic-Tac-Toe AI - Stage 3: The Menu Loop

## Description
This stage upgrades the application by wrapping the game inside a continuous menu loop. It introduces a command-line interface that lets users customize the match parameters before the game starts.

## Key Features
* **Command Interpreter:** Added `start` and `exit` commands.
* **Custom Matchups:** Users can define who plays as X and who plays as O by passing parameters (e.g., `start user easy`, `start easy user`, `start user user`).
* **AI vs AI:** You can now type `start easy easy` to sit back and watch two computers play against each other.
* **Error Handling:** Protects against invalid parameters by outputting `Bad parameters!` and returning to the menu.

## Example Output
```text
Input command: > start easy user
---------
|       |
|       |
|       |
---------
Making move level "easy"
---------
|       |
|       |
|     X |
---------
Enter the coordinates: >