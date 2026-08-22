package pl.javastart.library.logic;

import pl.javastart.library.model.Product;

import java.util.HashSet;
import java.util.Scanner;

public class UserInput {
  Scanner input = new Scanner(System.in);
  HashSet<Product> products = new HashSet<>();

  public void addProduct() {
    System.out.println("Dostępne opcje: ");
    System.out.println(" 1 - Dodaj produkt");
    System.out.println(" 0 - Wyjdz z programu");

    int option = input.nextInt();
    input.nextLine();

    if (option == 0) {
      for (Product o : products) {
        System.out.println(o.toString());
      }
      System.out.println("Pa pa!");
      return;
    } else if (option == 1) {
      System.out.println("Podaj nazwę produktu: ");
      String productName = input.nextLine();
      System.out.println("Podaj cenę produktu: ");
      double price = input.nextDouble();
//      input.nextLine();
      Product product = new Product(productName, price);
      if (products.contains(product)) {
        System.out.println("Taki produkt już istnieje!");
        System.out.println("Czy chcesz zastąpić produkt?");
        System.out.println("Wybierz '1' jesli tak lub '0' jesli nie.");
        int option2 = input.nextInt();
        input.nextLine();
        if (option2 == 1) {
          products.add(product);
          addProduct();
        } else {
          addProduct();
        }
      }
      products.add(product);
      addProduct();
    }
  }


}
