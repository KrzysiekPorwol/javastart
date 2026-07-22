package pl.javastart.library.model;

import pl.javastart.library.app.ArraysSum;

public class Arrays {

  public static void main() {
    int[] array2 = {4, 5, 6};
    int[] array1 = {1, 2, 3};

    System.out.println(array1[0]+array1[1]+array1[2]+array2[0]+array2[1]+array2[2]);

    ArraysSum arraysSum = new ArraysSum();

    System.out.println(arraysSum.arraysSum(array1, array2));
  }
}




//      Napisz program, w którym zadeklarujesz dwie tablice typu całkowitoliczbowego.
//      Każda z nich powinna przechowywać po 3 dowolne liczby typu int.
//      Program powinien wyświetlić sumę wszystkich liczb z obu tablic.
//
//Następnie zdefiniuj metodę, która realizuje to samo zadanie, czyli przyjmuje dwie tablice,
// a zwraca sumę wszystkich ich elementów.