package chupaaaaaaan;

import java.util.Scanner;

public class Abc049B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    sc.nextLine();
    String[] c = new String[h];

    for (int i = 0; i < h; ++i) {
      c[i] = sc.next();
    }

    for (int i = 0; i < h; ++i) {
      System.out.print(c[i] + "\n" + c[i] + "\n");
    }
  }
}
