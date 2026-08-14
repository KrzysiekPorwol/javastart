package pl.javastart.library.app;

public class Recursion {

  public static int recursion(int number) {
    if (number >= 1) {
      return number * recursion(number - 1);
    } else {
      return 0;
    }
  }

  static void main() {
    System.out.println(recursion(4));
    ;
  }

}

//Napisz metodę, która obliczy silnię liczby naturalnej,
//podanej jako argument. Metoda powinna być rekurencyjna.
//4! = 4 * 3 * 2 * 1