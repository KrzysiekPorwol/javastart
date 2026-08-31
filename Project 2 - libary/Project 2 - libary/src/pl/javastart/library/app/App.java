package pl.javastart.library.app;

import java.util.stream.Stream;

public class App {

  static void main() {

    Stream<Integer> numbers = Stream.iterate(0, x -> x + 1);

    Stream<Integer> filteredNumbers = numbers.filter(course -> course > 100);
    Stream<Integer> filteredNumbers2 = filteredNumbers.filter(course -> course < 1000);
    Stream<Integer> filteredNumbers3 = filteredNumbers2.filter(course -> course % 5 == 0);

    Stream<Integer> filteredNumbers4 = filteredNumbers3.limit(10);
    Stream<Integer> filteredNumbers5 = filteredNumbers4.map(x -> x * 3);
    filteredNumbers5.forEach(System.out::println);




  }

}




//Utwórz strumień kolejnych liczb całkowitych zaczynając od 0. Następnie korzystając z metody filter()
//wybierz tylko te z nich, które są większe od 100, mniejsze od 1000 i podzielne przez 5. Wyświetl na
//ekranie pierwszych 10 liczb tego strumienia pomnożonych przez 3
//
//Nie wykorzystuj w programie ani jednej pętli.