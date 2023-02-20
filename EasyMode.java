public class EasyMode extends Mode {
  static String chosenMode = "easy";
  
  public static void easyMode() {
    Grid.choosingLayout(chosenMode);
    Cards.cardNums(chosenMode);
  }
}