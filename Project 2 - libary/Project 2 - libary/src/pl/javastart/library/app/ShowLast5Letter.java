package pl.javastart.library.app;

import java.util.Scanner;

public class ShowLast5Letter {

  static void main() {

    int howManyWords;
    Scanner input = new Scanner(System.in);


    System.out.print("Ile wyrazow chcesz wprowadzic");
    howManyWords = input.nextInt();
    input.nextLine();
    StringBuilder stringBuilder = new StringBuilder();
    String result = "";
    for (int i = 0; howManyWords > i; i++) {
      System.out.println("Wprowadz wyraz: ");
      String words = input.nextLine();
      char lastLetter = words.charAt(words.length() - 1);
      stringBuilder = stringBuilder.append(lastLetter + "\n");
      result = stringBuilder.toString();
    }
//    String result =  stringBuilder.toString();

    System.out.println(result);


  }
}
//Pobierz od użytkownika liczbę, która określać będzie ile wyrazów użytkownik chce wprowadzić. Następnie
//wczytaj od niego listę ciągów znaków na podstawie, których wygenerujesz wynik.
//
//Wynikiem jest wyraz składający się z ostatnich liter każdego z wprowadzonych słów. Wykorzystaj klasy String i StringBuilder.