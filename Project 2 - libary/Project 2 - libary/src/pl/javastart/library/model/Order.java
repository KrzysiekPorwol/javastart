package pl.javastart.library.model;

public class Order {

  private Pizza pizza;
  private int idOrder;

  public Order(Pizza pizza, int idOrder) {
    this.pizza = pizza;
    this.idOrder = idOrder;
  }



  public Pizza getPizza() {
    return pizza;
  }

  public void setPizza(Pizza pizza) {
    this.pizza = pizza;
  }

  public int getIdOrder() {
    return idOrder;
  }

  public void setIdOrder(int idOrder) {
    this.idOrder = idOrder;
  }

  @Override
  public String toString() {
    return "Order{" +
          "pizza=" + pizza +
          ", idOrder=" + idOrder +
          '}';
  }
}
