package pl.javastart.library.logic;

import pl.javastart.library.model.Text;
import pl.javastart.library.model.TextArray;

import java.util.Scanner;

public class UserInput {

  Scanner input = new Scanner(System.in);


  public String userInputText() {
    System.out.println("Wprowadz 1 tekst: ");
    return input.nextLine().toLowerCase();
  }

  public String userInputText2() {
    System.out.println("Wprowadz 2 tekst: ");
    return input.nextLine().toLowerCase();
  }
}
