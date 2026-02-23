Here is a **simple, clean, copy-paste README.md** for your project:

---

# Tic-Tac-Toe (Java Console Application)

## Description

This project is a console-based Tic-Tac-Toe game written in Java.

The program works with a 3×3 board using coordinates.
The top-left cell is (1,1) and the bottom-right cell is (3,3).

Coordinate layout:

```
(1,1) (1,2) (1,3)
(2,1) (2,2) (2,3)
(3,1) (3,2) (3,3)
```

* The first number represents the row (top to bottom).
* The second number represents the column (left to right).
* Valid coordinates are 1, 2, or 3.

---

## How the Program Works

1. The user enters the initial board state.

    * It must contain 9 characters.
    * Allowed characters: X, O, _ (underscore means empty).

2. The program prints the board.

3. The user enters the coordinates where they want to make a move.

4. The program validates the input and handles these cases:

* If the user enters letters or symbols:

  ```
  You should enter numbers!
  ```

* If the coordinates are outside the range 1–3:

  ```
  Coordinates should be from 1 to 3!
  ```

* If the chosen cell is already occupied:

  ```
  This cell is occupied! Choose another one!
  ```

5. The program determines which symbol to place:

    * If the number of X and O is equal → place X
    * If there is one extra X → place O

6. The updated board is printed.

7. The program prints the current game state:

* X wins
* O wins
* Draw
* Game not finished

The board is printed only twice:

* Once before the move
* Once after a valid move

---

## Example

```
Enter the cells: _XXOO_OX_
---------
|   X X |
| O O   |
| O X   |
---------
Enter the coordinates: 1 1
---------
| X X X |
| O O   |
| O X   |
---------
X wins
```

---

## Technologies Used

* Java
* 2D Arrays
* Exception Handling
* Input Validation

---

## Author

Sanjay Kumar
GitHub: [https://github.com/sanjakumar-create](https://github.com/sanjakumar-create)

---

If you want, I can also make an even shorter version (very minimal) or a slightly more professional version.
