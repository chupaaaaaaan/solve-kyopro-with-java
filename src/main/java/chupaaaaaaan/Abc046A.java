package chupaaaaaaan;

import java.util.Scanner;

public class Abc046A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a != b && b != c && c != a) {
      System.out.println(3);
    } else if (a == b && b == c && c == a) {
      System.out.println(1);
    } else {
      System.out.println(2);
    }
  }
}