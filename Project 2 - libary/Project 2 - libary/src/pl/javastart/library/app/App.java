package pl.javastart.library.app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App {

  static void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("Podaj dzien miesiaca: ");
    int day = input.nextInt();
    input.nextLine();
    System.out.println("Podaj miesiac: ");
    int month = input.nextInt();
    input.nextLine();
    System.out.println("Podaj rok: ");
    int year = input.nextInt();
    input.nextLine();

    System.out.println("Podaj dzien miesiaca: ");
    int day2 = input.nextInt();
    input.nextLine();
    System.out.println("Podaj miesiac: ");
    int month2 = input.nextInt();
    input.nextLine();
    System.out.println("Podaj rok: ");
    int year2 = input.nextInt();
    input.nextLine();

    LocalDate firstDate = LocalDate.of(year, month, day);
    LocalDate secondDate = LocalDate.of(year2, month2, day2);

    Period differenceTime;

    if (firstDate.isAfter(secondDate)) {
      System.out.println(firstDate + " jest później niż " + secondDate);
      differenceTime = Period.between(secondDate, firstDate);   // od wcześniejszej do późniejszej
    } else {
      System.out.println(secondDate + " jest później niż " + firstDate);
      differenceTime = Period.between(firstDate, secondDate);   // od wcześniejszej do późniejszej
    }

    System.out.println("Roznica wynosi " + differenceTime.getYears() + " lat, "
          + differenceTime.getMonths() + " miesięcy i "
          + differenceTime.getDays() + " dni");


//    wyświetl informację o tym, która data jest "późniejsza",
//    wyświetl liczbę lat, miesięcy i dni pomiędzy wprowadzonymi datami.

  }

}
