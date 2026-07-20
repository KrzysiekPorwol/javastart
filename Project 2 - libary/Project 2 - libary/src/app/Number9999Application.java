package app;

import data.Number9999;
import logic.UpgradeNumber9999;

public class Number9999Application {
  public static void main() {
    Number9999 number9999 = new Number9999();
    int randomNumber = number9999.getNumber9999();

    System.out.println(randomNumber);

    if (randomNumber < 5000) {
      System.out.println("Wylosowana liczba jest mniejsza od 5000");
    } else if (randomNumber == 5000) {
      System.out.println("Wylosowana liczba jest równa 5000");
    } else {
      System.out.println("Wylosowana liczba jest większa niż 5000");
    }

    if (randomNumber % 2 == 0) {
      System.out.println("Wylosowana liczba jest parzysta");
    } else {
      System.out.println("Wylosowana liczba jest nieparzysta");
    }

    UpgradeNumber9999 upgradeNumber9999 = new UpgradeNumber9999();

    System.out.println("Liczba po ulepszeniu: " + upgradeNumber9999.upgradeNumber(randomNumber));
  }
}
