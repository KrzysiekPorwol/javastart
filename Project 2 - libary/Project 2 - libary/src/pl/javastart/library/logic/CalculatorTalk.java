package pl.javastart.library.logic;

import pl.javastart.library.model.CalculatorData;

import java.util.Scanner;

public class CalculatorTalk {

  public CalculatorData calculatorTalk() {
    Scanner input = new Scanner(System.in);
    CalculatorData calculatorData = new CalculatorData();
    boolean error = true;


    System.out.println("Wprowadź pierwszą liczbę: ");
    while (!input.hasNextDouble()) {
      System.out.println("To nie jest liczba, sprobuj ponownie");
      input.next();
    }
    calculatorData.setUserNumber1(input.nextDouble());
    input.nextLine();

    System.out.println("Wprowadź operator matematyczny: (+ lub - lub * lub /");
    while (input.next().charAt(0) != '+' && input.next().charAt(0) == '-' && input.next().charAt(0) == '*' && input.next().charAt(0) == '/') {
      System.out.println("To nie jest operator arytmetyczny, sprobuj ponownie!: ");
    }
    calculatorData.setUserOperator(input.next().charAt(0));
    input.nextLine();

    System.out.println("Wprowadź drugą liczbę: ");
    while (!input.hasNextDouble()) {
      System.out.println("To nie jest liczba, sprobuj ponownie");
      input.next();
    }
    calculatorData.setUserNumber2(input.nextDouble());
    input.nextLine();


    return calculatorData;
  }
}
