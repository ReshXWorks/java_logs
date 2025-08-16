import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initializeBoard();
        System.out.println("==== Tic Tac Toe ====");
        printBoard();
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter row and column (0, 1, or 2): ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid input! Try again.");
                continue;
            }
            if (board[row][col] != ' ') {
                System.out.println("Cell already taken! Try again.");
                continue;
            }
            board[row][col] = currentPlayer;
            printBoard();
          
            if (checkWin()) {
                System.out.println("🎉 Player " + currentPlayer + " wins!");
                break;
            }
            if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }
            // Switch players
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        sc.close();
    }
    // Empty board
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    // Print board for current state
    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }
    // Checks win condition
    private static boolean checkWin() {
        // For Rows & Columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && 
                board[i][1] == currentPlayer && 
                board[i][2] == currentPlayer) return true;

            if (board[0][i] == currentPlayer && 
                board[1][i] == currentPlayer && 
                board[2][i] == currentPlayer) return true;
        }
        // For Diagonals
        if (board[0][0] == currentPlayer && 
            board[1][1] == currentPlayer && 
            board[2][2] == currentPlayer) return true;
        if (board[0][2] == currentPlayer && 
            board[1][1] == currentPlayer && 
            board[2][0] == currentPlayer) return true;
        return false;
    }
    // Check if board is full (draw)
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }
}
