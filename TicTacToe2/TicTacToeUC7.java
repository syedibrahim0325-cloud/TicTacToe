import java.util.Random;

public class TicTacToeUC7 {

    
    public static void displayBoard(char[] board) {
        System.out.println();
        for (int i = 0; i < 9; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }

    
    public static void computerMove(char[] board) {
        Random rand = new Random();
        int move;

        while (true) {
            move = rand.nextInt(9); 

            
            if (board[move] != 'X' && board[move] != 'O') {
                board[move] = 'O'; // computer plays 'O'
                System.out.println("\nComputer chose position: " + (move + 1));
                break;
            }
        }
    }

    public static void main(String[] args) {

        
        char[] board = {'1','2','3','4','5','6','7','8','9'};

        displayBoard(board);

        
        computerMove(board);

        displayBoard(board);
    }
}