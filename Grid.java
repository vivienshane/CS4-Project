public class Grid {
  public static void easyGrid() {
    //10 cells
    System.out.println("Displays 10 cells");
  }
  public static void medGrid() {
    //20 cells
    System.out.println("Displays 20 cells");
  }
  public static void hardGrid() {
    //40 cells
    System.out.println("Displays 40 cells");
  }
  public static void tributeGrid() {
    //10 cells
    System.out.println("Displays 10 cells");
  }

  public static void choosingLayout(String cm) { //  possible exception if cm is not String  //
    switch(cm) {
      case "easy":
        easyGrid();
        break;
      case "medium":
        medGrid();
        break;
      case "hard":
        hardGrid();
        break;
      case "tribute":
        tributeGrid();
        break;
      default:
        System.out.println("Invalid input, please try again.");
    }
  }
}