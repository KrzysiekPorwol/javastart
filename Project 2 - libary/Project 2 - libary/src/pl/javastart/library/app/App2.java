package pl.javastart.library.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App2 {

  static void main() {

    List<Integer> list = new ArrayList<>(12);
    Random random = new Random();

    Supplier<Integer> supplier = () -> random.nextInt(50) + 1;

    for (int i = 0; i < 12; i++) {
      list.add(supplier.get());
    }

    Consumer<Integer> consumer = (number) -> System.out.print(number + ", ");

    for (int i = 0; i < list.size(); i++) {
      consumer.accept(list.get(i));
    }

    Predicate<Integer> predicate = (number) -> number > 25;

    System.out.println("");

    numberGreaterThan25(list, predicate);

    System.out.println("");

    for (int i = 0; i < list.size(); i++) {
      consumer.accept(list.get(i));
    }

  }

  public static List<Integer> numberGreaterThan25(List<Integer> list, Predicate<Integer> predicate) {
    Iterator<Integer> iterator = list.iterator();
    int howMuchRemove = 0;
    while (iterator.hasNext()) {

      if (predicate.test(iterator.next())) {
        iterator.remove();
        howMuchRemove++;
      }
    }
    System.out.print("Usunięto " + howMuchRemove + " liczb.");
    return list;
  }


}


//Zadanie
//
//      Napisz aplikację, która:
//
//Za pomocą klasy Random i interfejsu Supplier wygeneruje 12 losowych liczb z zakresu 1–50 i doda je do listy.
//Wyświetli listę na ekranie za pomocą interfejsu Consumer, ale tym razem liczby mają być oddzielone przecinkiem i spacją,
//np. 7, 23, 41, 5, ...
//Napisze własną metodę, która przyjmuje listę oraz interfejs Predicate i za pomocą iteratora usunie z listy wszystkie
//liczby większe od 25.
//Ponownie wyświetli listę (znów przez Consumer), żeby pokazać wynik po usunięciu.