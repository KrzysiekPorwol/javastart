package pl.javastart.library.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class App {


  static void main() {

    List<String> names = new ArrayList<>();

    names.add("Nikodem-ik");
    names.add("Mareczkun-ik");
    names.add("mikołaj-ik");
    names.add("Krzysiul-ik");
    names.add("Szymon-ik");




    Collections.sort(names, String::compareToIgnoreCase);

    for (String name : names) {
      System.out.println(name);

    }


  }


}
