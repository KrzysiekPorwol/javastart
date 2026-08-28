package pl.javastart.library.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomNumbersApp {

  static void main() {

    Random random = new Random();
    Supplier<Integer> supplier = () -> random.nextInt(100);

    List<Integer> tenNumbers = generate10Number(supplier);

    Consumer<Integer> consumer = (number) -> System.out.print(number + " ");

    show10Number(consumer, tenNumbers);

    Predicate<Integer> predicate = (number) -> number % 2 == 0;


    System.out.println();
    remove10Number(predicate, tenNumbers);

    show10Number(consumer, tenNumbers);
  }


  public static List<Integer> generate10Number(Supplier<Integer> supplier) {
    List<Integer> tenNumbers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      tenNumbers.add(supplier.get());
    }
    return tenNumbers;
  }

  public static void show10Number(Consumer<Integer> consumer, List<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      consumer.accept(list.get(i));
    }
  }

  public static void remove10Number(Predicate<Integer> predicate, List<Integer> list) {
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {
      Integer number = iterator.next();
      if (predicate.test(number)) {
        iterator.remove();
      }
    }
  }
}

//Napisz aplikację, w której z wykorzystaniem klasy Random i wyrażenia lambda wygenerujesz 10 losowych liczb
//(interfejs Supplier). Wyświetl listę (wszystkie liczby obok siebie, po spacji)
//na ekranie również wykorzystując wyrażenia lambda (interfejs Consumer).
//
//Następnie napisz metodę, która usunie z listy wszystkie liczby podzielne przez 2
//      (użyj iteratora i własnej metody wykorzystującej interfejs Predicate).
//
//Ponownie wyświetl wynik na ekranie.