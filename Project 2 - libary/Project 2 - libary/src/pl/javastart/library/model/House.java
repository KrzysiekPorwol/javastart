package pl.javastart.library.model;

import java.util.Comparator;
public class House implements Comparable<House> {
  private String city;
  private int price;
  private int area;

  public House(String city, int price, int area) {
    this.city = city;
    this.area = area;
    this.price = price;
  }

  public House() {

  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getArea() {
    return area;
  }

  public void setArea(int area) {
    this.area = area;
  }

  @Override
  public String toString() {
    return "House{" +
          "city='" + city + '\'' +
          ", price=" + price +
          ", area=" + area +
          '}';
  }

  @Override
  public int compareTo(House o) {
    if ((this.price / this.area) < (o.price / o.area) ) {
      return -1;
    } else if ((this.price  / this.area) == (o.price / o.area) ) {
      return 0;
    } else {
      return 1;
    }
  }
}
