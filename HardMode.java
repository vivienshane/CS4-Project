public class HardMode extends Mode {
  static String chosenMode = "hard";
  
  public static void hardMode() {
    Grid.choosingLayout(chosenMode);
    Cards.cardNums(chosenMode);
  }
}