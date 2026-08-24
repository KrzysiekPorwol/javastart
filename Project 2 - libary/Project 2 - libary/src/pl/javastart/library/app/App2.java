package pl.javastart.library.app;

import com.sun.source.tree.Tree;
import pl.javastart.library.logic.PrintProducts;
import pl.javastart.library.logic.UserInput2;
import pl.javastart.library.logic.file.ReadFile;
import pl.javastart.library.model.Product;

import java.util.Map;
import java.util.TreeSet;

public class App2 {

  static void main() {

    PrintProducts printProducts = new PrintProducts();
    UserInput2 userInput2 = new UserInput2();

    printProducts.PrintAllProducts(userInput2.UserCategory());


  }

}
