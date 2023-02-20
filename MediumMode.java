public class MediumMode extends Mode {
  static String chosenMode = "medium";
  
  public static void medMode() {
    Grid.choosingLayout(chosenMode);
    Cards.cardNums(chosenMode);
  }
}