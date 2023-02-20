import java.util.Scanner;
import java.util.HashMap;
//import java.util.ArrayList;

public class Player {
  private static String name;
  private int score; //find how to update
  public static HashMap <String, Player> players = new HashMap <String, Player>(); //work this out
  //public static ArrayList<Player> playerList = new ArrayList<>();
  static Scanner sc = new Scanner(System.in);

  public Player(String n) {
    name = n;
    score = 0;
  }

  public static void addPlayer() { //  possible exception if name had been taken already or name is not String //
    System.out.print("What is your name: ");
    String inputName = sc.nextLine();
    players.put(inputName, new Player(inputName));

    
    //start debug

    
    //playerList.add(inputName, Player currentPlayer)
    //playerList.add(new Player(inputName));

    //Player currentPlayer = players.get(inputName);
    //System.out.print(players.get(inputName));
    //System.out.println(currentPlayer.getName());

    //System.out.print(players.get(inputName).score); //works


    //end debug

    
  }

  public static void updateScore(int fs, Player cp) {
    players.replace(cp.getName(), cp).score = fs;
  }

  public String getName() {
    return name;
  }
  public int getScore() {
    return score;
  }
}