class Offer {
  Product product;
  double price;
  boolean special;

  Offer(Product newproduct, double newPrice, boolean newSpecial) {
    product = newproduct;
    price = newPrice;
    special = newSpecial;
  }

  void printInfo() {
    System.out.println(product.name + " "
          + product.producer + " "
          + price + "zł, "
          + "oferta specjalna? " + special);
  }
}