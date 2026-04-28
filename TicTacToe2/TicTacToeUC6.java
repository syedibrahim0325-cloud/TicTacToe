public class TicTacToeUC6 {
    private char[][] board;

    public Board() {
        board = new char[3][3];

        // Initialize board with empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

 
    public boolean placeMove(int row, int col, char symbol) {
        // Check if move is valid
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (board[row][col] == ' ') {
                board[row][col] = symbol; // Update state
                return true;
            } else {
                System.out.println("Cell already occupied!");
                return false;
            }
        } else {
            System.out.println("Invalid position!");
            return false;
        }
    }

   
    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("--|---|--");
            }
        }
    }
}