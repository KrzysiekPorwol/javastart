package pl.javastart.library.logic;

import java.util.Scanner;

public class UserInput2 {

  Scanner input = new Scanner(System.in);

  public String UserCategory() {
    Scanner input = new Scanner(System.in);
    System.out.println("Wprowadz kategorie jaka chcesz wybrac np. rtv, biuro, komputery: ");
    return input.nextLine();
  }
}
