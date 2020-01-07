package chupaaaaaaan;

import java.util.Scanner;

public class Abc046B {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    System.out.println((int) (k * Math.pow(k - 1, n - 1)));
  }
}
