public class Cards {
  public static void easyCard() {
    //5 pairs
    System.out.println("Displays 10 cards of 5 pairs");
  }
  public static void medCard() {
    //10 pairs
    System.out.println("Displays 20 cards of 10 pairs");
  }
  public static void hardCard() {
    //20 pairs
    System.out.println("Displays 40 cards of 20 pairs");
  }
  public static void tributeCard() {
    //5 pairs
    System.out.println("Displays 10 cards of 5 pairs");
  }
  
  public static void cardNums(String cm) {
    switch(cm) {
      case "easy":
        easyCard();
        break;
      case "medium":
        medCard();
        break;
      case "hard":
        hardCard();
        break;
      case "tribute":
        tributeCard();
        break;
      default:
        System.out.println("Invalid input, please try again.");
    }
  }
}