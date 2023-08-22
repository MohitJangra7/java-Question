package projects;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of tic-tac-toe: ");
        int size = sc.nextInt();
        String[][] board = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = "";
            }
        }

        System.out.print("Enter your choice 'X' or 'O': ");
        String player = sc.next();

        int turn = 1;
        while (turn <= size * size) {
            int row = 0;
            int col = 0;
            boolean validMove = false;
            while (!validMove) {
                System.out.print("Player " + player + ", enter your move (row column): ");
                row = sc.nextInt() - 1;
                col = sc.nextInt() - 1;
                if (row < 0 || row >= size || col < 0 || col >= size) {
                    System.out.println("Invalid move, try again.");
                } else if (!board[row][col].equals("")) {
                    System.out.println("This cell is already occupied, try again.");
                } else {
                    validMove = true;
                }
            }
            board[row][col] = player;
            printBoard(board);
            if (checkWinner(board, row, col, player)) {
                System.out.println("Player " + player + " wins!");
                break;
            }
            turn++;
            player = (player.equals("X")) ? "O" : "X";
        }
        if (turn > size * size) {
            System.out.println("Game ended in a draw.");
        }

        sc.close();
    }

    public static boolean checkWinner(String[][] board, int row, int col, String player) {
        int size = board.length;
        String[] rowValues = new String[size];
        String[] colValues = new String[size];
        String[] diagonalValues = new String[2];
        boolean diagonalComplete = true;
        boolean antiDiagonalComplete = true;

        for (int i = 0; i < size; i++) {
            rowValues[i] = board[row][i];
            colValues[i] = board[i][col];
            if (!board[i][i].equals(player)) {
                diagonalComplete = false;
            }
            diagonalValues[0] = board[0][0];
            diagonalValues[1] = board[size - 1][0];
            if (!board[i][size - 1 - i].equals(player)) {
                antiDiagonalComplete = false;
            }
        }

        if (allEqual(rowValues, player) || allEqual(colValues, player) || diagonalComplete || antiDiagonalComplete) {
            return true;
        }

        return false;
    }

    public static boolean allEqual(String[] arr, String value) {
        for (String s : arr) {
            if (!s.equals(value)) {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(String[][] board) {
        int size = board.length;
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("[] |");
                } else {
                    System.out.print(" "+board[i][j] + " | ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
