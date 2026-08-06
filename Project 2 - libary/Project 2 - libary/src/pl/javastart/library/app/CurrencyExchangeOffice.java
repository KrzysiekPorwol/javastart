package pl.javastart.library.app;

import pl.javastart.library.model.Currency;

import java.util.Scanner;

public class CurrencyExchangeOffice {

  static void main() {

    System.out.println(Currency.values());

    for (Currency o : Currency.values()) {
      System.out.println(o.toString());
    }

    Scanner input = new Scanner(System.in);

    System.out.println("Wpisz kod waluty: (EUR, USD, GBP, CHF");

    Currency currency = Currency.valueOf(input.nextLine());

    System.out.println("Wpisz kwotę do przeliczenia: ");

    double sum = input.nextInt();

    System.out.println(currency.changeInToZloty(sum));
    }
  }


//Zadanie 1 — Kantor walut (poziom: rozgrzewka)
//
//Piszesz prosty przelicznik walut na złotówki.
//
//Stwórz enum Waluta z kilkoma walutami: EUR, USD, GBP, CHF. Każda waluta ma nieść ze sobą dwie informacje:
//
//swój kurs do złotówki (double), np. EUR = 4.30, USD = 4.00, GBP = 5.10, CHF = 4.50 (wartości możesz przyjąć dowolne),
//swój symbol do wyświetlania (String), np. EUR = "€", USD = "$", GBP = "£", CHF = "CHF".
//
//Enum ma pozwalać odczytać kurs i symbol (gettery).
//
//Dodaj do enuma metodę naZlotowki(double kwota), która zwraca, ile złotych dostaniemy za podaną kwotę w tej walucie
//  (czyli kwota * kurs). Uwaga — to metoda w enumie, korzystająca z pola kurs tej konkretnej waluty.
//
//W klasie z main:
//
//Wypisz wszystkie dostępne waluty wraz z ich kursem (przejdź po values()).
//Wczytaj od użytkownika kod waluty (np. USD) i kwotę.
//Zamień kod na stałą enuma i wypisz wynik przeliczenia.
