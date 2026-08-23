package pl.javastart.library.logic;

import pl.javastart.library.model.Choice;
import pl.javastart.library.model.Company;
import pl.javastart.library.model.Employee;

import java.util.HashMap;
import java.util.Scanner;

public class UserInput {

  Scanner input = new Scanner(System.in);
  Company company = new Company();


  public void userInput() {

    choiceText();

    int choice = input.nextInt();
    input.nextLine();

    if (choice == Choice.EXIT.getChoice()) {
      System.out.println("Pa pa!");
      return;
    } else if (choice == Choice.ADD.getChoice()) {
      System.out.println("Podaj imie pracownika: ");
      String firstName = input.nextLine();
      System.out.println("Podaj nazwisko pracownika: ");
      String lastName = input.nextLine();
      System.out.println("Podaj miesieczny zarobek: ");
      int salary = input.nextInt();
      input.nextLine();

      Employee employee = new Employee(firstName, lastName, salary);

      company.addEmployee(employee);

      userInput();

    } else if (choice == Choice.SHOW.getChoice()) {
      System.out.println("Podaj imie pracownika którego szukasz: ");
      String firstName = input.nextLine();
      System.out.println("Podaj nazwisko pracownika którego szukasz: ");
      String lastName = input.nextLine();


      if (company.findEmployee(firstName, lastName) == null) {
        System.out.println("Nie ma takiego pracownika! ");
        userInput();
      } else {
        System.out.println(company.findEmployee(firstName, lastName).toString());
        userInput();
      }
    }

  }

  public void choiceText() {
    System.out.println("=== SYSTEM PRACOWNIKÓW ===");
    System.out.println("Wybierz opcję:");
    System.out.println("1 - Dodanie nowego pracownika");
    System.out.println("2 - Wyszukanie informacji o pracowniku");
    System.out.println("0 - Wyjście z programu");
    System.out.print("Twój wybór: ");
  }

}
