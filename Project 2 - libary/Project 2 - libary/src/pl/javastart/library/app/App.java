package pl.javastart.library.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {

  static void main() {

    List<Integer> numbers = new ArrayList<>();
    Random random = new Random();

    Supplier<Integer> supplier = () -> random.nextInt(100);

    for (int i = 0; i < 10; i++) {
      numbers.add(supplier.get());
    }

    Consumer<Integer> consumer = (number) -> System.out.print(number + " ");

    for (int i = 0; i < 10; i++) {
      consumer.accept(numbers.get(i));
    }

    Predicate<Integer> predicate = (number) -> number % 2 == 0;

    divideNumbers(numbers, predicate);

//    Iterator<Integer> iterator = numbers.iterator();
//
//
//    while (iterator.hasNext()) {
//      Integer number = iterator.next();
//      if (predicate.test(number)) {
//        iterator.remove();
//      }
//
//    }

    System.out.println();          // przejście do nowej linii
    numbers.forEach(consumer);



  }

  public static  List<Integer> divideNumbers (List<Integer> list, Predicate<Integer> predicate) {
    Iterator<Integer> iterator = list.iterator();


    while (iterator.hasNext()) {
      Integer number = iterator.next();
      if (predicate.test(number)) {
        iterator.remove();
      }
    }
    return list;
  }




}


//Napisz aplikację, w której z wykorzystaniem klasy Random i wyrażenia lambda wygenerujesz 10 losowych liczb
//      (interfejs Supplier). Wyświetl listę (wszystkie liczby obok siebie, po spacji)
//na ekranie również wykorzystując wyrażenia lambda (interfejs Consumer).
//
//Następnie napisz metodę, która usunie z listy wszystkie liczby podzielne przez 2
//      (użyj iteratora i własnej metody wykorzystującej interfejs Predicate).
//
//Ponownie wyświetl wynik na ekranie.

