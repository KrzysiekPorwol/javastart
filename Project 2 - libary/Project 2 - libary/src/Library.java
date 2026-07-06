public class Library {
  public static void main(String[] args) {
    int cenaChlebaNetto = 7;
    double vat = 0.23;
    double vatChleba = cenaChlebaNetto * vat;
    System.out.println("Cena chleba netto: " + cenaChlebaNetto);
    System.out.println("Wysokość podatku vat dla chleba: " + vatChleba);
    System.out.print("Cena chleba brutto: ");
    System.out.println(cenaChlebaNetto + vatChleba);
  }
}

//Ceny produktów w sklepach wyrażane są jako kwoty brutto.
// Na cenę taką składa się cena netto oraz podatek VAT.
// Przykładowo jeżeli cena netto produktu wynosi 100zł,
// a podatek VAT dla tego towaru wynosi 23%, to cena brutto
// wyniesie 123 zł, ponieważ 100 + 100*0,23 = 123.
//
//Napisz program, w którym do zmiennej przypiszesz liczbę,
// która będzie oznaczała cenę netto pewnego towaru.
// Do drugiej zmiennej przypisz wartość, która będzie
// wyrażała wysokość stawki VAT (np. 0.23 będzie odpowiadało stawce 23% VAT).
//
//Przypisz do zmiennych przykładowe wartości, a następnie oblicz i
// wyświetl kwotę netto, wysokość podatku VAT dla tego produktu,
// oraz kwotę brutto do zapłaty za towar. Możesz definiować w
// programie dowolne dodatkowe zmienne, jeżeli uznasz to za pomocne.