public class TicTacToe {

    
    public static boolean checkDraw(char[] board) {

        // Traverse the board
        for (int i = 0; i < 9; i++) {

            // If any cell is not occupied, game is not draw
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }

       
        return true;
    }

    public static void main(String[] args) {

        char[] board = {
            'X','O','X',
            'X','O','O',
            'O','X','X'
        };

        if (checkDraw(board)) {
            System.out.println("It's a Draw!");
        } else {
            System.out.println("Game still in progress.");
        }
    }
}