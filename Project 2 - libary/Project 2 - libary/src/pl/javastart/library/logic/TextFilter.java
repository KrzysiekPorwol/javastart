package pl.javastart.library.logic;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class TextFilter {

  public int howManyNumbers(String text) {
    int sum = 0;

    for (int i = 0; (text.length() - i) > 0; i++) {
      char a = text.charAt(i);
      if (isDigit(a)) {
        sum = sum + 1;
      }

    }
    return sum;
  }

  public int howManyLetter(String text) {
    int sum = 0;

    for (int i = 0; (text.length() - i) > 0; i++) {
      char a = text.charAt(i);
      if (isLetter(a)) {
        sum = sum + 1;
      }
    }
    return sum;
  }

  public void bigNumber(String text) {
    int najwieksza = -1;
    for (int i = 0; (text.length() - i) > 0; i++) {
      char a = text.charAt(i);
      if (isDigit(a)) {
        int wartosc = Character.getNumericValue(a);
        if (najwieksza < wartosc) {
          najwieksza = wartosc;
        }
      }
    }
    if (najwieksza == -1) {
      System.out.println("W tekscie nie ma zadnej cyfry");
    } else {
      System.out.println("W tekscie najwieksza liczba to: " + najwieksza);
    }

  }

}
