package pl.javastart.library.model;

public class Order {
  private Status status;
  private String name;
  private double price;
  private static final int MAX_ORDERS = 100;

  public Order(Status status, String name, double price) {
    this.status = status;
    this.name = name;
    this.price = price;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Order[] showOrders(Order[] orders, Status status) {
    int count = 0;
    Order[] orders1 = new Order[MAX_ORDERS];
    for (int i = 0; orders.length > i; i++) {
      if (status == orders[i].status) {
        orders1[count] = orders[i];
        count++;
      }
    }
    Order[] orders2 = new Order[count];
    for (int i = 0; i < count; i++) {
      orders2[i] = orders1[i];
    }
    return orders2;
  }

  @Override
  public String toString() {
    return "Order{" +
          "status=" + status +
          ", name='" + name + '\'' +
          ", price=" + price +
          '}';
  }
}
