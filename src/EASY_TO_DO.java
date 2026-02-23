
import java.util.Random;
import java.util.Scanner;

public class EASY_TO_DO {


    static final int SIZE = 3;
    static char[][] board = new char[SIZE][SIZE];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        initializeBoard();
        printBoard();

        while (true) {

            userMove();
            printBoard();

            if (isGameFinished()) break;

            computerMove();
            printBoard();

            if (isGameFinished()) break;
        }
    }

    static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '_';
            }
        }
    }

    static void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print((board[i][j] == '_' ? " " : board[i][j]) + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    static void userMove() {

        while (true) {
            System.out.print("Enter the coordinates: ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (parts.length != 2) {
                System.out.println("You should enter numbers!");
                continue;
            }

            int row, col;

            try {
                row = Integer.parseInt(parts[0]);
                col = Integer.parseInt(parts[1]);
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                continue;
            }

            if (row < 1 || row > 3 || col < 1 || col > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            if (board[row - 1][col - 1] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }

            board[row - 1][col - 1] = 'X';
            break;
        }
    }

    static void computerMove() {
        System.out.println("Making move level \"easy\"");

        int row, col;

        while (true) {
            row = random.nextInt(3);
            col = random.nextInt(3);

            if (board[row][col] == '_') {
                board[row][col] = 'O';
                break;
            }
        }
    }

    static boolean isGameFinished() {

        if (hasWon('X')) {
            System.out.println("X wins");
            return true;
        }

        if (hasWon('O')) {
            System.out.println("O wins");
            return true;
        }

        if (isBoardFull()) {
            System.out.println("Draw");
            return true;
        }

        return false;
    }

    static boolean hasWon(char player) {

        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == player &&
                    board[i][1] == player &&
                    board[i][2] == player) return true;

            if (board[0][i] == player &&
                    board[1][i] == player &&
                    board[2][i] == player) return true;
        }

        if (board[0][0] == player &&
                board[1][1] == player &&
                board[2][2] == player) return true;

        if (board[0][2] == player &&
                board[1][1] == player &&
                board[2][0] == player) return true;

        return false;
    }

    static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '_') return false;
            }
        }
        return true;
    }
}
