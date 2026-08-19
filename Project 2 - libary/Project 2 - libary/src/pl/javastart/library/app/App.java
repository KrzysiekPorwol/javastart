package pl.javastart.library.app;

import pl.javastart.library.logic.file.ReadNumbers;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

  static void main() throws IOException {
    ReadNumbers readNumbers = new ReadNumbers();

    System.out.println(readNumbers.numbers());

    System.out.println(readNumbers.bigNumbers());


  }




}



//      Napisz program, który z pliku w formie takiej jak poniżej:
//
//      123
//      1234
//      12345
//      123456789123456789
//      987654321987654321
//
//zwróci wynik: dodawania trzech pierwszych liczb oraz oddzielnie wynik dodawania dwóch ostatnich liczb.
//
//Do pierwszych trzech liczb wykorzystaj typ int, a do dwóch ostatnich BigInteger.
//
//
