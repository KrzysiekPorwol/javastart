package pl.javastart.library.app;

import java.util.Arrays;
import java.util.Comparator;

public class App {

  static void main() {
    Integer[] liczby = {5, 2, 8, 1, 9, 3, 7, 4, 6, 0,
          15, 12, 18, 11, 19, 13, 17, 14, 16, 10};

    System.out.println(Arrays.toString(liczby));

    Arrays.sort(liczby, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1 - o2;
      }
    });

    System.out.println(Arrays.toString(liczby));

    Arrays.sort(liczby, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });

    System.out.println(Arrays.toString(liczby));


  }


}


