package pl.javastart.library.logic;

import java.util.Scanner;

public class UserScanner {

  public String takeTextFromUser() {
    Scanner input = new Scanner(System.in);
    System.out.println("Wprowadz dowolny tekst skladajacy sie z liter i cyfr");
    return input.nextLine();
  }

}
