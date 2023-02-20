public class Mode {
  static String chosenMode;
  
  public static void choosingMode(String input) {
    switch(input) {
      case "easy":
        EasyMode.easyMode();
        break;
      case "medium":
        MediumMode.medMode();
        break;
      case "hard":
        HardMode.hardMode();
        break;
      case "tribute":
        TributeMode.tributeMode();
        break;
      default:
        System.out.println("Invalid input, please try again.");
    }
  }
  
  public static void randomNumGen(String m) {
    //random num gen for card-cell assignment
  }
}