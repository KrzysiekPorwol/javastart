package pl.javastart.library.app;

import pl.javastart.library.model.Pizza;

import java.util.Locale;
import java.util.Scanner;

public class Pizzeria {

  static void main() {

    System.out.println("W naszym menu mamy takie pizze: ");


    for (Pizza p : Pizza.values()) {
      System.out.println(p);
    }

    System.out.println("Proszę podać pizze którą zamawiasz: ");

    Scanner choise = new Scanner(System.in);

    String userChoise = choise.nextLine();

    userChoise = userChoise.toUpperCase(Locale.ROOT);

    Pizza userChoiseEnum = Pizza.valueOf(userChoise);

    System.out.println("Zamowiles: " + userChoiseEnum.toString());
  }

}
