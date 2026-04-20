import java.util.Random;

public class TicTacToeUC2 {

    public static void main(String[] args) {

        
        char player1Symbol, player2Symbol;
        char currentPlayerSymbol;

        Random rand = new Random();

        
        int toss = rand.nextInt(2); // 0 or 1

        
        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayerSymbol = player1Symbol;
            System.out.println("Player 1 won the toss!");
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayerSymbol = player2Symbol;
            System.out.println("Player 2 won the toss!");
        }

        
        System.out.println("Player 1 symbol: " + player1Symbol);
        System.out.println("Player 2 symbol: " + player2Symbol);
        System.out.println("First turn: " + currentPlayerSymbol);
    }
}