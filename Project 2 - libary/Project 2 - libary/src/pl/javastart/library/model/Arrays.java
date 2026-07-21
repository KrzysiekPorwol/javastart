package pl.javastart.library.model;

public class Arrays {
  public int[] array1 = {1, 2, 3};
  public int[] array2 = {4, 5, 6};

  static void main() {
    Arrays arrays = new Arrays();
    System.out.println(arrays.array1[0]+arrays.array1[1]+arrays.array1[2]+arrays.array2[0]+arrays.array2[1]+arrays.array2[2]);

    Arrays arrays1 = new Arrays();

    System.out.println(arrays1.array1.length + arrays1.array2.length);
  }
}




//      Napisz program, w którym zadeklarujesz dwie tablice typu całkowitoliczbowego.
//      Każda z nich powinna przechowywać po 3 dowolne liczby typu int.
//      Program powinien wyświetlić sumę wszystkich liczb z obu tablic.
//
//Następnie zdefiniuj metodę, która realizuje to samo zadanie, czyli przyjmuje dwie tablice,
// a zwraca sumę wszystkich ich elementów.