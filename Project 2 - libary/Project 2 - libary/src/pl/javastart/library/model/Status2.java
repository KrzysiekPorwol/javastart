package pl.javastart.library.model;

public enum Status2 {
  NEW("Zamówienie nie opłacone"),
  PAID("Zamówienie opłacone"),
  SHIPPED("Zamówienie wysłane"),
  DELIVERED("Zamówienie dostarczone"),
  CANCELLED("Zamówienie anulowane");
  private static final int MAX_ORDERS = 100;

  private final String description;

  Status2(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

//  public Order2[] showOrdersBasedStatus(Order2[] orders2, Status2 status2) {
//    Order2[] orders3 = new Order2[MAX_ORDERS];
//    int ordersWithThisSameStatus = 0;
//    for (int i = 0; i < orders2.length; i++) {
//      if (orders2[i].getStatus2() == status2) {
//        orders3[ordersWithThisSameStatus] = orders2[i];
//        ordersWithThisSameStatus++;
//      }
//    }
//    Order2[] orders4 = new Order2[ordersWithThisSameStatus];
//    for (int j = 0; ordersWithThisSameStatus > j; j++) {
//      orders4[j] = orders3[j];
//    }
//    return orders4;
//  }
}
