package pl.javastart.library.model;

public class Cart {

  private Product[] products = new Product[10];
  private int size;
  private int suma = 0;


  public void addProduct(Product product) {
    products[size] = product;
    size++;
  }

  public Product[] getProducts() {
    return products;
  }

  public void setProducts(Product[] products) {
    this.products = products;
  }

  public int totalCost(int licznik) {
    if (licznik >= 0) {
      suma = suma + products[licznik].getPrice();
      totalCost(licznik - 1);
      return suma;
    }
    return 1;
  }
}


//W klasie Cart dodaj też metodę totalCost(), która zwraca sumę cen wszystkich produktów dodanych do koszyka.
//W programie nie możesz wykorzystywać pętli. W ramach programu możesz definiować dowolne metody (zwykłe lub rekurencyjne),
//które uznasz za pomocne. W wymienionych klasach możesz także definiować dodatkowe pola.