


import java.util.*;

public class Stage_4_Medium_AI {

    static char[][] board = new char[3][3];
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        while (true) {
            System.out.print("Input command: ");
            String command = sc.nextLine();

            if (command.equals("exit")) break;

            String[] parts = command.split(" ");
            if (parts.length != 3 || !parts[0].equals("start")) {
                System.out.println("Bad parameters!");
                continue;
            }

            String player1 = parts[1];
            String player2 = parts[2];

            if (!isValidPlayer(player1) || !isValidPlayer(player2)) {
                System.out.println("Bad parameters!");
                continue;
            }
            startGame(player1, player2);
        }
    }

    static void startGame(String player1, String player2) {
        initBoard();
        printBoard();
        char currentPlayer = 'X';

        while (true) {
            makeMove(currentPlayer == 'X' ? player1 : player2, currentPlayer);
            printBoard();

            if (checkWin('X')) {
                System.out.println("X wins");
                break;
            } else if (checkWin('O')) {
                System.out.println("O wins");
                break;
            } else if (isDraw()) {
                System.out.println("Draw");
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    static void makeMove(String type, char symbol) {
        if (type.equals("user")) {
            userMove(symbol);
        } else if (type.equals("easy")) {
            System.out.println("Making move level \"easy\"");
            easyMove(symbol);
        } else if (type.equals("medium")) {
            System.out.println("Making move level \"medium\"");
            mediumMove(symbol);
        }
    }

    static void userMove(char symbol) {
        while (true) {
            System.out.print("Enter the coordinates: ");
            String[] parts = sc.nextLine().split(" ");
            try {
                int row = Integer.parseInt(parts[0]) - 1;
                int col = Integer.parseInt(parts[1]) - 1;
                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                if (board[row][col] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                board[row][col] = symbol;
                break;
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
            }
        }
    }

    static void easyMove(char symbol) {
        while (true) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            if (board[row][col] == ' ') {
                board[row][col] = symbol;
                break;
            }
        }
    }

    static void mediumMove(char symbol) {
        if (tryWinningMove(symbol, symbol)) return;
        char opponent = (symbol == 'X') ? 'O' : 'X';
        if (tryWinningMove(opponent, symbol)) return;
        easyMove(symbol);
    }

    static boolean tryWinningMove(char testSymbol, char placeSymbol) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = testSymbol;
                    if (checkWin(testSymbol)) {
                        board[i][j] = placeSymbol;
                        return true;
                    }
                    board[i][j] = ' ';
                }
            }
        }
        return false;
    }

    static boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) return true;
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) return true;
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) return true;
        return board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol;
    }

    static boolean isDraw() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == ' ') return false;
        return true;
    }

    static void initBoard() {
        for (int i = 0; i < 3; i++) Arrays.fill(board[i], ' ');
    }

    static void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) System.out.print(board[i][j] + " ");
            System.out.println("|");
        }
        System.out.println("---------");
    }

    static boolean isValidPlayer(String p) {
        return p.equals("user") || p.equals("easy") || p.equals("medium");
    }
}