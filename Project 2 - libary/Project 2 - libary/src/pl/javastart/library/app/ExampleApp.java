package pl.javastart.library.app;

import java.util.Arrays;
import java.util.Comparator;

public class ExampleApp {

  static void main() {
    Integer[] numbers = {40, 10, 30, 50, 20};


    System.out.println(Arrays.toString(numbers));

    Arrays.sort(numbers, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1 - o2;
      }
    });

    System.out.println(Arrays.toString(numbers));

    Arrays.sort(numbers, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });

    System.out.println(Arrays.toString(numbers));

  }
}
//
//Teraz Twoje zadanie 🎯
//
//Zrobisz małe ćwiczenie, żeby poczuć to własnymi palcami. Nie patrz na rozwiązanie z poprzednich wiadomości — spróbuj sam.
//
//Zadanie:
//
//Utwórz tablicę Integer[] z pięcioma dowolnymi liczbami, np. { 40, 10, 30, 50, 20 }.
//Wyświetl ją przed sortowaniem.
//Posortuj ją rosnąco (od najmniejszej) i wyświetl wynik.
//Posortuj ją malejąco (od największej) i wyświetl wynik.
//
//Zasady, których musisz użyć:
//
//Do sortowania użyj Arrays.sort(tablica, zasada).
//Zasadę napisz jako anonimową klasę wewnętrzną (new Comparator<Integer>() { ... }) — tak jak w Kroku 4.
//Dla rosnąco w compare zwróć a - b, dla malejąco zwróć b - a. Zastanów się, dlaczego (podpowiedź: ujemne = pierwszy argument idzie na początek).