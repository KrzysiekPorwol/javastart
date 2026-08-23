package pl.javastart.library.model;

public class Product implements Comparable<Product> {
  private String category;
  private String name;
  private int price;

  public Product(String category, String name, int price) {
    this.category = category;
    this.name = name;
    this.price = price;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Product{" +
          "category='" + category + '\'' +
          ", name='" + name + '\'' +
          ", price=" + price +
          '}';
  }

  @Override
  public int compareTo(Product o) {
    int wynik = Integer.compare(this.getPrice(), o.getPrice());
    if (wynik == 0) {
      wynik = this.getName().compareTo(o.getName());
      return wynik;
    } else {
      return wynik;
    }

  }
}
