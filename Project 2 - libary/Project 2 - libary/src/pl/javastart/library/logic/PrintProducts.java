package pl.javastart.library.logic;

import pl.javastart.library.logic.file.ReadFile;
import pl.javastart.library.model.Product;

import java.util.Map;
import java.util.TreeSet;

public class PrintProducts {

  UserInput2 userInput2 = new UserInput2();

  public void PrintAllProducts(String userChoice) {

    ReadFile readFile = new ReadFile();
    Map<String, TreeSet<Product>> mapa = readFile.readFile();

    TreeSet<Product> categoryAll = mapa.get(userChoice);

    System.out.println(categoryAll.getFirst());
    System.out.println(categoryAll.getLast());

    double suma = 0;
    for (Product product : categoryAll) {
     suma = suma + product.getPrice();
    }

    System.out.println(suma / categoryAll.size());

    System.out.println(mapa.get(userChoice));
  }


}
