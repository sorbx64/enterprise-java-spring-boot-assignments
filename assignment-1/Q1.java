public class Q1 {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
      // print I
      for(int j=0; j<n; j++) {
        if(j == (n-1)/2) 
          System.out.print("*");
        else 
          System.out.print(" ");
      }
      System.out.print(" ");

      // print N
      for (int j = 0; j < n; j++) {
        if (j == 0 || i == j || j == n - 1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print(" ");

      // print E
      for (int j = 0; j < n; j++) {
        if (j == 0 || i == 0 || i == (n - 1) / 2 || i == n - 1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print(" ");

      // print U
      for (int j = 0; j < n; j++) {
        if (j == 0 || i == n - 1 || j == n - 1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print(" ");

      // print R
      for (int j = 0; j < n; j++) {
        if (j == 0 || i == 0 || j == n - 1 && i <= (n - 1) / 2 || i == (n - 1) / 2 || (i == j && i >= (n - 1) / 2))
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print(" ");

      // print O
      for (int j = 0; j < n; j++) {
        if (j == 0 || i == 0 || j == n - 1 || i == n - 1)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.print(" ");

      // print N
      for (int j = 0; j < n; j++) {
        if (j == 0 || j == n - 1 || i == j)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}