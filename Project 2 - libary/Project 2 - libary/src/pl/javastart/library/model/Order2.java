package pl.javastart.library.model;

public class Order2 {
  private static final int MAX_ORDERS = 100;
  private Status2 status2;
  private String orderName;
  private double orderPrice;
  private int orderId;

  public Order2(Status2 status2, String orderName, double orderPrice) {
    if (orderId < MAX_ORDERS) {
      this.status2 = status2;
      this.orderName = orderName;
      this.orderPrice = orderPrice;
      orderId++;
    }
  }

  public Status2 getStatus2() {
    return status2;
  }

  public void setStatus2(Status2 status2) {
    this.status2 = status2;
  }

  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  public double getOrderPrice() {
    return orderPrice;
  }

  public void setOrderPrice(double orderPrice) {
    this.orderPrice = orderPrice;
  }

  @Override
  public String toString() {
    return "Order2{" +
          "status2=" + status2 +
          ", orderName='" + orderName + '\'' +
          ", orderPrice=" + orderPrice +
          ", orderId=" + orderId +
          '}';
  }

    public static Order2[] showOrdersBasedStatus(Order2[] orders2, Status2 status2) {
    Order2[] orders3 = new Order2[MAX_ORDERS];
    int ordersWithThisSameStatus = 0;
    for (int i = 0; i < orders2.length; i++) {
      if (orders2[i].getStatus2() == status2) {
        orders3[ordersWithThisSameStatus] = orders2[i];
        ordersWithThisSameStatus++;
      }
    }
    Order2[] orders4 = new Order2[ordersWithThisSameStatus];
    for (int j = 0; ordersWithThisSameStatus > j; j++) {
      orders4[j] = orders3[j];
    }
    return orders4;
  }
}


//      Zdefiniuj metodę, która przyjmuje dwa parametry: tablicę z zamówieniami i status, a zwraca tablicę z
//      zamówieniami, które mają status taki jak przekazany argument (np. wszystkie opłacone zamówienia).
