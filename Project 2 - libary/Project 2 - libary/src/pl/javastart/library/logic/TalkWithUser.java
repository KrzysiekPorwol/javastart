package pl.javastart.library.logic;

import pl.javastart.library.model.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TalkWithUser {

  private static final Scanner input = new Scanner(System.in);
  private int EmployeeNumber;

  public int TalkWithUserChoice() {
    int userChoice = 0;

    do {
      System.out.println("Wybierz 1, jesli chcesz poczytac informacje o pracownikach, lub 2, jesli chcesz wprowadzic nowe dane o pracownikach");
      try {
        userChoice = input.nextInt();
        input.nextLine();
        if (userChoice != 1 && userChoice != 2) {
          System.out.println("Musisz wybrac 1 albo 2. Sprobuj ponownie.");
        }
      } catch (InputMismatchException e) {
        System.out.println("To nie jest liczba! Wpisz 1 lub 2.");
        input.nextLine();
      }
    } while (userChoice != 1 && userChoice != 2);
    return userChoice;
  }

  public Employee TalkWithUserTakeInfo() {
    String firstName = "";
    String lastName = "";
    int salary = 0;
      System.out.println("Podaj imie " + (EmployeeNumber + 1) + " pracownika: ");
      firstName = input.nextLine();
      System.out.println("Podaj nazwisko " + (EmployeeNumber + 1) + " pracownika: ");
      lastName = input.nextLine();
      try {
        System.out.println("Podaj zarobek miesieczny " + (EmployeeNumber + 1) + " pracownika: ");
        salary = input.nextInt();
        input.nextLine();
      } catch (InputMismatchException e) {
        System.out.println("To nie jest liczba! Wpisz liczbę całkowitą!");
        input.nextLine();
      }
      EmployeeNumber++;
    return new Employee(firstName, lastName, salary);
  }
}
