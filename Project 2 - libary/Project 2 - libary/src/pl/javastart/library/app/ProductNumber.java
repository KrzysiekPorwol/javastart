package pl.javastart.library.app;

import java.util.Scanner;

public class ProductNumber {

  static void main() {
    int multi = 1;
    int next = 0;
    int index;

    Scanner input = new Scanner(System.in);

    for (index = 0; index < 5; index++) {
      System.out.println("Podaj liczbę całkowitą: ");
      next = input.nextInt();
      multi = multi * next;
    }

    if (multi >= 0) {
      System.out.println("Wynik mnożenia dał liczbę nieujemną");
    } else {
      System.out.println("Wynik mnożenia dał liczbę ujemną");
    }
  }

}
