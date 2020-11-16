import java.util.Scanner;

public class TicTacToeMain {
   
   public static void main(String[] args) {
   
      boolean gameOver = false;
      boolean tie = false;
      Scanner scan = new Scanner(System.in);
      TicTacToeGame game = new TicTacToeGame();
      int playerInput;
      
      System.out.println("Welcome to tic tac toe!\nPlayer 1 goes first, then player 2.");
      System.out.println("The first player to place three X's (player 1)\nor three O's (player 2) in a row winns!");
      System.out.println("The player has to enter the number that corresponds to where they want\nto place their mark.");
      
      while(!game.gameOver()) {
         
         System.out.println(game.printGameBoard());
         System.out.println("Player 1:");
         playerInput = scan.nextInt();
         while (!game.verifyInput(playerInput)) {
            System.out.println("Input is not valid, try again!");
            playerInput = scan.nextInt();
         }
         game.updateGameBoard(1, playerInput);
         
         if (game.gameOver()) {
            break;
         }
         
         if (game.isTie()) {
            tie = true;
            break;
         }
         
         System.out.println(game.printGameBoard());
         System.out.println("Player 2:");
         playerInput = scan.nextInt();
         while (!game.verifyInput(playerInput)) {
            System.out.println("Input is not valid, try again!");
            playerInput = scan.nextInt();
         }
         game.updateGameBoard(2, playerInput);  
         
         if (game.isTie()) {
            tie = true;
            break;
         }  
      }
      
      System.out.println(game.printGameBoard());
      
      if (tie) {
         System.out.println("Player 1 and 2 tied!");
      }
      else {
         System.out.println("The winner is player: " +  game.getWinner());
      }
   }  
}