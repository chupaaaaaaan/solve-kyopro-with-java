package chupaaaaaaan;

import java.util.Scanner;

public class Abc051B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int s = sc.nextInt();

    int a = 0;
    for (int x = 0; x <= k; ++x) {
      for (int y = 0; y <= k; ++y) {
        if (s - x - y >= 0 && s - x - y <= k) {
          ++a;
        }
      }
    }
    System.out.println(a);
  }
}
