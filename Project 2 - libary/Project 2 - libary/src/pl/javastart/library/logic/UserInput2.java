package pl.javastart.library.logic;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput2 {
  Scanner input = new Scanner(System.in);
  ArrayList<Integer> numbers = new ArrayList<>();

  public ArrayList<Integer> userInput() {

    System.out.println("Podaj liczbę: ");
    try {
      Integer number = Integer.parseInt(input.nextLine());
      if (number % 5 == 0 && number >= 0) {
        numbers.add(number);
        userInput();
      }
    } catch (NumberFormatException e) {
      System.out.println("Podaj tylko liczbe, nie litery!");
      userInput();
    }
    return numbers;
  }
}
