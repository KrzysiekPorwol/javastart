package pl.javastart.library.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChoiceNumbers {
  Scanner input = new Scanner(System.in);
  ArrayList<Integer> userNumbers = new ArrayList<>(6);

  public ArrayList<Integer> userInput() {
    System.out.println("Gramy w lotto.");
    for (int i = 1; i < 7; i++) {
      System.out.println("Podaj " + i + " liczbę: ");
      userNumbers.add(input.nextInt());
      input.nextLine();
    }
    return userNumbers;
  }

  @Override
  public String toString() {
    return "Twoje skreslone liczby to: " + userNumbers;
  }
}
