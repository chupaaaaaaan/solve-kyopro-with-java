package chupaaaaaaan;

import java.util.Scanner;

public class Abc044A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());

    if (n < k) {
      System.out.println(n * x);
    } else {
      System.out.println(k * x + (n - k) * y);
    }
  }
}
