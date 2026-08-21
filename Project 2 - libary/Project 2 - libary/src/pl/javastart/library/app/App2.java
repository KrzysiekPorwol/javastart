package pl.javastart.library.app;

import pl.javastart.library.logic.file.ReadFile;
import pl.javastart.library.model.House;

import java.util.Arrays;
import java.util.Comparator;

public class App2 {

  static void main() {
    ReadFile readFile = new ReadFile();

    House[] houses = readFile.readFile();

    Arrays.sort(houses);


    for (int i = 0; i < 10; i++) {
      System.out.println(houses[i].toString());
    }
  }

}
