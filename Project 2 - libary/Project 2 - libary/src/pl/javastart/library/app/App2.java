package pl.javastart.library.app;

import com.sun.source.tree.Tree;
import pl.javastart.library.logic.file.ReadFile;
import pl.javastart.library.model.Product;

import java.util.Map;
import java.util.TreeSet;

public class App2 {

  static void main() {

    ReadFile readFile = new ReadFile();
    Map<String, TreeSet<Product>> mapa = readFile.readFile();
    System.out.println(mapa);
  }

}
