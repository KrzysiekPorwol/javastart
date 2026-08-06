package pl.javastart.library.model;

public enum Currency {
  EUR(4.30, "€"), USD(3.50, "$"),
  GBP(5.0, "£"), CHF(0.08, "CHF");

  private final double exchangeRate;
  private final String currencyDesignation;

  Currency(double exchangeRate, String currencyDesignation) {
    this.exchangeRate = exchangeRate;
    this.currencyDesignation = currencyDesignation;
  }

  public double getExchangeRate() {
    return exchangeRate;
  }

  public String getCurrencyDesignation() {
    return currencyDesignation;
  }

  public double changeInToZloty(double sum) {
    return sum * exchangeRate;
  }

  @Override
  public String toString() {
    return name() +
          "exchangeRate=" + exchangeRate +
          ", currencyDesignation='" + currencyDesignation + '\'';
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
