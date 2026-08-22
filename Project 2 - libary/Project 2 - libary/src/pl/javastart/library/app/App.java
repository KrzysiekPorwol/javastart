package pl.javastart.library.app;

import pl.javastart.library.logic.file.ReadFile;

import java.util.TreeSet;

public class App {

  static void main() {
    ReadFile readFile = new ReadFile();

    TreeSet<String> names = readFile.readFile();

    System.out.println(names.first());
    System.out.println(names.last());
    System.out.println(names);

  }

}
