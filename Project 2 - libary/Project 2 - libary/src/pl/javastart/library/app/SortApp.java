package pl.javastart.library.app;

import pl.javastart.library.model.BiggestNumber;

public class SortApp {

  static void main() {

    int[] tablica = new int[6];

    tablica[0] = 125;
    tablica[1] = 15;
    tablica[2] = 112515;
    tablica[3] = 124365135;
    tablica[4] = 1;
    tablica[5] = 24;

    BiggestNumber biggestNumber = new BiggestNumber() {
      @Override
      public int[] takeBiggest() {
        for (int i = 0; i < tablica.length - 1; i++) {
          for (int j = 0; j < tablica.length - i - 1; j++) {
            if (tablica[j] > tablica[j + 1]) {
              int temp = tablica[j];
              tablica[j] = tablica[j + 1];
              tablica[j + 1] = temp;
            }
          }
        }
        return tablica;
      }
    };

    int[] wynik = biggestNumber.takeBiggest();

    for (int i = 0; wynik.length > i; i++) {
      System.out.println(wynik[i]);
    }

  }

}
