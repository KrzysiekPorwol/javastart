package pl.javastart.library.app;

import java.util.Scanner;

public class ReadingNumbers {

  public static void main() {

    final int Number100 = 100;
    int userNumber;
    int sum = 0;
    Scanner input = new Scanner(System.in);

    System.out.println("Sprawdzmy, czy suma Twoich liczb będzie parzysta czy nieparzysta!");
    System.out.println("Wprowadż pierwszą liczbę: ");
    userNumber = input.nextInt();

    while (userNumber <= Number100) {
      sum += userNumber;
      System.out.println("Wprowadż kolejną liczbę: ");
      userNumber = input.nextInt();
    }


    if (sum == 0) {
      System.out.println("Zadna liczba nie była brana pod uwagę, dlatego nie ma odpowiedzi czy jest parzysta czy nie.");
    } else {
      if (sum % 2 == 0) {
        System.out.println("Gratulacje twoja liczba jest parzysta!");
      } else {
        System.out.println("Gratulacje, twoja liczba jest nieparzysta");
      }
    }

  }

}
