package chupaaaaaaan;

import java.util.Scanner;

public class Abc052B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int x = 0;
    int y = 0;

    for (int i = 0; i < n; ++i) {
      if (s.charAt(i) == 'I') {
        ++x;
      } else {
        --x;
      }
      if (x > y) {
        y = x;
      }
    }
    System.out.println(y);
  }
}
