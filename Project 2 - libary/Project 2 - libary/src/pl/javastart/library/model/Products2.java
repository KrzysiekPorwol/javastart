package pl.javastart.library.model;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Products2 {

  private Map<String, TreeSet<Product>> products2 = new HashMap<>();

  public Products2() {

  }

  public Map<String, TreeSet<Product>> getProducts2() {
    return products2;
  }

  public void setProducts2(Map<String, TreeSet<Product>> products2) {
    this.products2 = products2;
  }

//  public void addProducts2(Product product) {
//    String key = product.getCategory();
//    products2.put(key, );
//  }
}
