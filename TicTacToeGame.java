public class TicTacToeGame {

   private String[] gameBoard;
   private int winner;
   
   public TicTacToeGame() {
      gameBoard = new String[] {
         "1", "2", "3",
         "4", "5", "6",
         "7", "8", "9"
      };
      winner = 0;     
   }
   
   public String printGameBoard() {
      return "\n " + gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2] + "\n" + "----------- \n" +
               " " + gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5] + "\n" + "----------- \n" +
               " " + gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8] + "\n\n";
   }
   
   public boolean gameOver() {
      if (gameBoard[0].equals("X") && gameBoard[1].equals("X") && gameBoard[2].equals("X")) {winner = 1; return true;}
      else if (gameBoard[3].equals("X") && gameBoard[4].equals("X") && gameBoard[5].equals("X")) {winner = 1; return true;}
      else if (gameBoard[6].equals("X") && gameBoard[7].equals("X") && gameBoard[8].equals("X")) {winner = 1; return true;}
      else if (gameBoard[0].equals("X") && gameBoard[3].equals("X") && gameBoard[6].equals("X")) {winner = 1; return true;}
      else if (gameBoard[1].equals("X") && gameBoard[4].equals("X") && gameBoard[7].equals("X")) {winner = 1; return true;}
      else if (gameBoard[2].equals("X") && gameBoard[5].equals("X") && gameBoard[8].equals("X")) {winner = 1; return true;}
      else if (gameBoard[0].equals("X") && gameBoard[4].equals("X") && gameBoard[8].equals("X")) {winner = 1; return true;}
      else if (gameBoard[2].equals("X") && gameBoard[4].equals("X") && gameBoard[6].equals("X")) {winner = 1; return true;}
      
      else if (gameBoard[0].equals("O") && gameBoard[1].equals("O") && gameBoard[2].equals("O")) {winner = 1; return true;}
      else if (gameBoard[3].equals("O") && gameBoard[4].equals("O") && gameBoard[5].equals("O")) {winner = 2; return true;}
      else if (gameBoard[6].equals("O") && gameBoard[7].equals("O") && gameBoard[8].equals("O")) {winner = 2; return true;}
      else if (gameBoard[0].equals("O") && gameBoard[3].equals("O") && gameBoard[6].equals("O")) {winner = 2; return true;}
      else if (gameBoard[1].equals("O") && gameBoard[4].equals("O") && gameBoard[7].equals("O")) {winner = 2; return true;}
      else if (gameBoard[2].equals("O") && gameBoard[5].equals("O") && gameBoard[8].equals("O")) {winner = 2; return true;}
      else if (gameBoard[0].equals("O") && gameBoard[4].equals("O") && gameBoard[8].equals("O")) {winner = 2; return true;}
      else if (gameBoard[2].equals("O") && gameBoard[4].equals("O") && gameBoard[6].equals("O")) {winner = 2; return true;}
      
      else {return false;}
   }
   
   public boolean verifyInput(int position) {
      if (position >=0 && position <=9 && !gameBoard[position - 1].equals("X") && !gameBoard[position - 1].equals("O")){
         return true;
      }
      else {
         return false;
      }
   }
   
   public void updateGameBoard(int player, int position) {
      if (player == 1) {
         gameBoard[position - 1] = "X";
      }
      else {
         gameBoard[position - 1] = "O";
      }   
   }
   
   public boolean isTie() {
      if (!gameBoard[0].equals("1") && !gameBoard[1].equals("2") && !gameBoard[2].equals("3") &&
          !gameBoard[3].equals("4") && !gameBoard[4].equals("5") && !gameBoard[5].equals("6") &&
          !gameBoard[6].equals("7") && !gameBoard[7].equals("8") && !gameBoard[8].equals("9")){
         return true;
      }
      else {
         return false;
      }
   }
   
   public int getWinner() {
      return winner;
   }
}