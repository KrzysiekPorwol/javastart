package pl.javastart.library.app;

import java.util.Scanner;

public class UpperOrLowerCase {

  static void main() {
    System.out.println("Wpisz dowolny napis: ");

    Scanner input = new Scanner(System.in);

    StringBuilder stringBuilder = new StringBuilder();

    String userInput = input.nextLine();

    char userInputChar = userInput.charAt(0);

    if (Character.isLowerCase(userInputChar)) {
      System.out.println(userInput.toLowerCase());
    } else if (Character.isUpperCase(userInputChar)) {
      System.out.println(userInput.toUpperCase());
    } else {
      System.out.println(userInput);
    }
  }

}

//Wczytaj od użytkownika dowolny napis. Jeżeli napis ten rozpoczyna się wielką literą, to zamień cały
//tekst na wielkie litery, a jeżeli rozpoczyna się małą literą, to zamień go na małe litery. Zamieniony
//tekst wyświetl następnie w konsoli.

//Jeżeli wprowadzony przez użytkownika tekst nie rozpoczyna się od wielkiej, ani małej litery, tylko od cyfry
//lub innego znaku, to wyświetl oryginalny tekst.
