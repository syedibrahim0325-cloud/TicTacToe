public class TicTacToeUC9 {

    
    public static boolean checkWin(char[] board, char player) {

      
        int[][] winPatterns = {
            {0,1,2}, {3,4,5}, {6,7,8}, // Rows
            {0,3,6}, {1,4,7}, {2,5,8}, // Columns
            {0,4,8}, {2,4,6}           // Diagonals
        };

        for (int i = 0; i < winPatterns.length; i++) {
            int a = winPatterns[i][0];
            int b = winPatterns[i][1];
            int c = winPatterns[i][2];

            // Check if all three positions match the player symbol
            if (board[a] == player &&
                board[b] == player &&
                board[c] == player) {
                return true; // Win found
            }
        }

        return false; // No win
    }

    // Demo main (for testing)
    public static void main(String[] args) {
        char[] board = {
            'X','X','X',
            '4','O','6',
            'O','8','9'
        };

        if (checkWin(board, 'X')) {
            System.out.println("Player X Wins!");
        } else {
            System.out.println("No win yet.");
        }
    }
}