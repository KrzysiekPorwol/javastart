package pl.javastart.library.app;

import pl.javastart.library.model.Cart;
import pl.javastart.library.model.Product;

public class CartApp {

  static void main() {
    Cart cart = new Cart();

    cart.addProduct(new Product("Dupa", 50));
    cart.addProduct(new Product("Dupa", 50));
    cart.addProduct(new Product("Dupa", 50));
    cart.addProduct(new Product("Dupa", 50));
    cart.addProduct(new Product("Dupa", 508));
    cart.addProduct(new Product("Dupa", 50));
    cart.addProduct(new Product("Dupa", 50));
    cart.addProduct(new Product("Dupa", 50));
    cart.addProduct(new Product("Dupa", 50));
    cart.addProduct(new Product("Dupa", 50));

    System.out.println(cart.totalCost(9));


  }

}
