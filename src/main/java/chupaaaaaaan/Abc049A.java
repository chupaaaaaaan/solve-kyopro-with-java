package chupaaaaaaan;

import java.util.Scanner;

public class Abc049A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String c = sc.next();

    if (c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u")) {
      System.out.println("vowel");
    } else {
      System.out.println("consonant");
    }
  }
}
