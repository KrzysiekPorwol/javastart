package pl.javastart.library.model;

import java.util.TreeSet;

public class ProductsTreeSet {

  TreeSet<Product> productTreeSet = new TreeSet<>();

  public ProductsTreeSet() {
  }

  public TreeSet<Product> getProductTreeSet() {
    return productTreeSet;
  }

  public void setProductTreeSet(TreeSet<Product> productTreeSet) {
    this.productTreeSet = productTreeSet;
  }

  public void addProduct(Product product) {
    productTreeSet.add(product);
  }
}
