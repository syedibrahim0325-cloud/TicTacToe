public class TicTacToeUC4 {

   
    public static int[] getRowCol(int slot) {
        int row = (slot - 1) / 3;   // Division → row
        int col = (slot - 1) % 3;   // Modulo → column

        return new int[]{row, col}; // Return as array
    }

    public static void main(String[] args) {
        int slot = 5; // Example input

        int[] position = getRowCol(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}