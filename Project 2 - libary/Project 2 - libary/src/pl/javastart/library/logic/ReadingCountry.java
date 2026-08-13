package pl.javastart.library.logic;

import java.util.Scanner;

public class ReadingCountry {
  public static String readingCountry() {
    Scanner input = new Scanner(System.in);
    System.out.println("Podaj nazwę kraju, który chcesz wyświetlić: ");
    String tekst = input.nextLine();
    tekst = tekst.substring(0, 1).toUpperCase() + tekst.substring(1);


    return tekst;
  }

}
