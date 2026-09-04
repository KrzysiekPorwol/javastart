package pl.javastart.library.app;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

  static void main() {
    Scanner input = new Scanner(System.in);


    System.out.print("Wprowadz jedno z pytań: Jaki jest wynik dodawania a do b?, Jaki dziś dzień tygodnia, Ile znaków ma tekst 'Ala ma kota'? ");

    String question = input.nextLine();

    Pattern pattern = Pattern.compile(
          "(?i)(?:Jaki jest wynik dodawania (?<dodajA>-?\\d+) do (?<dodajB>-?\\d+)\\?|" +
                "(?<dzien>Jaki dziś dzień tygodnia\\?*)|" +
                "Ile znaków ma tekst \"(?<tekst>.*)\"\\?)");

    Matcher matcher = pattern.matcher(question);

    if (matcher.find()) {
      if (matcher.group("dodajA") != null) {
        int a = Integer.parseInt(matcher.group("dodajA"));
        int b = Integer.parseInt(matcher.group("dodajB"));
        int sum = a + b;
        System.out.print("Wynik dodawania " + a +  " + " + b + " to " + sum);
      } else if (matcher.group("dzien") != null) {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String displayDay = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.of("pl"));
        System.out.print("Dziś jest " + displayDay);
      } else if (matcher.group("tekst") != null) {
        String text = matcher.group("tekst");
        System.out.print("Tekst ma " + text.length() + " znaków");

      }
    }




//    System.out.print("Jaki jest wynik dodawania ");
//    String number1 = input.nextLine();
//    System.out.print(" do ");
//    String number2 = input.nextLine();
//    if (number1.matches("^\\d{1,5}$") || number2.matches("^\\d{1,5}$")) {
//      int score = Integer.parseInt(number1) + Integer.parseInt(number2);
//      System.out.print("Wynik dodawania " + number1 + " + " + number2 + " = " + score);
//    } else {
//      System.out.print("Wprowadziles co innego niz cyfry!");
//    }
//    System.out.println("Jaki dzis dzien tygodnia");


  }

}

//Jaki jest wynik dodawania 2 do 5?
//Wynik dodawania 2 + 5 to 7
//jaki dziś dzień tygodnia
//Dziś jest wtorek
//Ile znaków ma tekst "Ala ma kota"?
//Tekst ma 11 znaków (czarne: 9, białe: 2)