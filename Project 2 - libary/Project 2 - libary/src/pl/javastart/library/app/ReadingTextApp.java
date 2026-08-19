package pl.javastart.library.app;

import pl.javastart.library.logic.TextFilter;
import pl.javastart.library.logic.UserScanner;

public class ReadingTextApp {

  static void main() {
    TextFilter textFilter = new TextFilter();
    UserScanner userScanner = new UserScanner();
    String textUser = userScanner.takeTextFromUser();

    System.out.println(textUser);

    System.out.println("Ten tekst posiada " + textFilter.howManyNumbers(textUser) + " cyfry");

    System.out.println("Ten tekst posiada " + textFilter.howManyLetter(textUser) + " liter");

   textFilter.bigNumber(textUser);
  }

}
