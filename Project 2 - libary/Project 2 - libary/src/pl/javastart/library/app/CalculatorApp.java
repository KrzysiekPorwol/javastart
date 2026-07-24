package pl.javastart.library.app;

import pl.javastart.library.logic.Calculations;
import pl.javastart.library.model.Data;

import java.util.Scanner;

public class CalculatorApp {
  public static void main() {
    Scanner input = new Scanner(System.in);
    System.out.print("Wprowadź pierwszą liczbę: ");

    Data data1 = new Data();
    data1.setA(input.nextInt());

    input.nextLine();
    System.out.print("Jak chcesz policzyć? Wprowadź w zależności od potrzeby: +, -, /, *: ");
    data1.setOperator(input.nextLine());

    System.out.print("Wprowadź drugą liczbę: ");
    data1.setB(input.nextInt());

    Calculations calculations = new Calculations();
    calculations.calculate(data1);
  }
}
