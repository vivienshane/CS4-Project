import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static String input;
  static String instructions = "set of instructions to be added";
  static boolean ready = false;
  static boolean playAgain = true;
  
  public static void main(String[] args) {
    do {
      do {
        System.out.println(instructions);
        System.out.print("Is the player ready to proceed? (yes or no): ");
        input = sc.nextLine();
  
        if(input.equalsIgnoreCase("yes")) {
          ready = true;
  
          Player.addPlayer();
        }
      } while(!ready);

      ready = false;
  
      
      //start debugg------------------------------------
  
      
      //Player.addPlayer();
      //Player.addPlayer();
  
      //System.out.print("Which player's name do you want to check: ");  //nes
      //String player = sc.nextLine(); //nes
      //System.out.println("Chosen player is " + player); //nes
      //System.out.println(player.getName());
  
      //Player currentPlayer = Player.players.get(player); //nes
      //System.out.print(currentPlayer.getName()); //dunno why but it's overriden by another instance of Player //nes
  
      
      //end debug------------------------------------
  
  
      System.out.print("Choose game mode (easy, medium, hard, tribute): "); //should be converted to buttons
      input = sc.nextLine();
      Mode.choosingMode(input);
  
      System.out.print("Quit game (yes or no): ");
      input = sc.nextLine();
      if (input.equalsIgnoreCase("yes")) {
        playAgain = false;
      }
    } while(playAgain);
  }
}