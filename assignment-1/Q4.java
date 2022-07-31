public class Q4 {
  public static void main(String[] args) {
    int rows = 8, cols = 14;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (i - j >= 0 || i + j >= cols - 1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
