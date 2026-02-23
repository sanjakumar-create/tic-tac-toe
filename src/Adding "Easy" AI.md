Here is a **simple, clean, copy-paste ready README.md** for your **User vs Computer (Easy Level)** version:

---

# Tic-Tac-Toe (User vs Computer – Easy Level)

## Description

This project is a console-based Tic-Tac-Toe game written in Java.

In this version:

* The user plays as **X**
* The computer plays as **O**
* The computer uses **easy level AI** (random moves)

The game starts with an empty 3×3 board.
Players take turns until someone wins or the game ends in a draw.

---

## Game Rules

* The user enters coordinates in the format:
  `row column`
* Coordinates must be between **1 and 3**
* The first number represents the row (top to bottom)
* The second number represents the column (left to right)

Board coordinate layout:

```
(1,1) (1,2) (1,3)
(2,1) (2,2) (2,3)
(3,1) (3,2) (3,3)
```

---

## Input Validation

The program handles invalid inputs:

* If the user enters letters or symbols:

  ```
  You should enter numbers!
  ```

* If coordinates are outside the range 1–3:

  ```
  Coordinates should be from 1 to 3!
  ```

* If the selected cell is already occupied:

  ```
  This cell is occupied! Choose another one!
  ```

The program keeps asking until valid input is provided.

---

## Game Outcomes

The game ends when:

* `X wins` – Three X’s in a row
* `O wins` – Three O’s in a row
* `Draw` – Board is full and no winner

---

## Example

```
---------
|       |
|       |
|       |
---------
Enter the coordinates: 2 2
---------
|       |
|   X   |
|       |
---------
Making move level "easy"
---------
| O     |
|   X   |
|       |
---------
```

---

## Technologies Used

* Java
* 2D Arrays
* Random class
* Input validation
* Basic game logic

---

## Author

Sanjay Kumar
GitHub: [https://github.com/sanjakumar-create](https://github.com/sanjakumar-create)

---

If you'd like, I can now prepare a **more professional GitHub-style README with badges and formatting** for better mentor impression.
