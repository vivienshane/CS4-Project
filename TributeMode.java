public class TributeMode extends Mode {
  static String chosenMode = "tribute";
  
  public static void tributeMode() {
    Grid.choosingLayout(chosenMode);
    Cards.cardNums(chosenMode);
  }
}