import java.util.Scanner;

public class TicTacToeAIStage1 {

    private static final int SIZE = 3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Tic-Tac-Toe ===");
        System.out.print("Enter the initial board state (9 characters using X, O, _): ");

        String input = scanner.nextLine();
        char[][] board = createBoard(input);

        printBoard(board);

        makeMove(scanner, board);

        printBoard(board);

        System.out.println(getGameState(board));
    }

    private static char[][] createBoard(String input) {
        char[][] board = new char[SIZE][SIZE];
        int index = 0;

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                board[row][col] = input.charAt(index++);
            }
        }
        return board;
    }

    private static void printBoard(char[][] board) {
        System.out.println("---------");
        for (int row = 0; row < SIZE; row++) {
            System.out.print("| ");
            for (int col = 0; col < SIZE; col++) {
                char cell = board[row][col];
                System.out.print((cell == '_' ? " " : cell) + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    private static void makeMove(Scanner scanner, char[][] board) {

        while (true) {
            System.out.print("Enter your move (row and column): ");
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
            } catch (NumberFormatException e) {
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

            char symbol = getCurrentPlayer(board);
            board[row - 1][col - 1] = symbol;
            break;
        }
    }

    private static char getCurrentPlayer(char[][] board) {
        int countX = 0;
        int countO = 0;

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 'X') countX++;
                if (board[row][col] == 'O') countO++;
            }
        }

        return countX == countO ? 'X' : 'O';
    }

    private static String getGameState(char[][] board) {

        boolean xWins = hasWon(board, 'X');
        boolean oWins = hasWon(board, 'O');
        boolean emptyExists = hasEmptyCells(board);

        if (xWins) return "X wins";
        if (oWins) return "O wins";
        if (!emptyExists) return "Draw";

        return "Game not finished";
    }

    private static boolean hasWon(char[][] board, char player) {

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

    private static boolean hasEmptyCells(char[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == '_') return true;
            }
        }
        return false;
    }
}