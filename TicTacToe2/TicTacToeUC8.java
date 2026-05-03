import java.util.Random;
import java.util.Scanner;

public class TicTacToe8 {

    static char[] board = {'1','2','3','4','5','6','7','8','9'};

    
    public static void displayBoard() {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 3 == 0) System.out.println();
        }
    }

    public static boolean checkWin(char player) {
        int[][] winPositions = {
            {0,1,2}, {3,4,5}, {6,7,8}, // rows
            {0,3,6}, {1,4,7}, {2,5,8}, // columns
            {0,4,8}, {2,4,6}           // diagonals
        };

        for (int[] pos : winPositions) {
            if (board[pos[0]] == player &&
                board[pos[1]] == player &&
                board[pos[2]] == player) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDraw() {
        for (char c : board) {
            if (c != 'X' && c != 'O') return false;
        }
        return true;
    }

    
    public static void playerMove(Scanner sc) {
        int move;
        while (true) {
            System.out.print("\nEnter position (1-9): ");
            move = sc.nextInt() - 1;

            if (move >= 0 && move < 9 &&
                board[move] != 'X' && board[move] != 'O') {
                board[move] = 'X';
                break;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    
    public static void computerMove() {
        Random rand = new Random();
        int move;

        while (true) {
            move = rand.nextInt(9);
            if (board[move] != 'X' && board[move] != 'O') {
                board[move] = 'O';
                System.out.println("\nComputer chose: " + (move + 1));
                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean gameRunning = true;
        boolean playerTurn = true;

        displayBoard();

       
        while (gameRunning) {

            if (playerTurn) {
                playerMove(sc);
                displayBoard();

                if (checkWin('X')) {
                    System.out.println("\nPlayer Wins!");
                    gameRunning = false;
                }
            } else {
                computerMove();
                displayBoard();

                if (checkWin('O')) {
                    System.out.println("\nComputer Wins!");
                    gameRunning = false;
                }
            }

            // Check draw
            if (gameRunning && checkDraw()) {
                System.out.println("\nIt's a Draw!");
                gameRunning = false;
            }

            
            playerTurn = !playerTurn;
        }

        sc.close();
    }
}