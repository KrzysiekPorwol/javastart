package pl.javastart.library.app;

import pl.javastart.library.model.Order;
import pl.javastart.library.model.Status;

import java.util.Locale;
import java.util.Scanner;

public class OrdersApp {

  static void main() {
    Order[] orders = new Order[7];

//    orders[0] = order1;
//    orders[1] = order2;
    orders[0] = new Order(Status.NEW, "Laptop", 2000);
    orders[1] = new Order(Status.PAID, "Laptopa", 3000);
    orders[2] = new Order(Status.DELIVERED, "Laptopaa", 4000);
    orders[3] = new Order(Status.CANCELED, "Laptopaaa", 5000);
    orders[4] = new Order(Status.SHIPPED, "Laptopaaaa", 6000);
    orders[5] = new Order(Status.NEW, "Laptopaaaaa", 7000);
    orders[6] = new Order(Status.NEW, "Laptopaaaaaa", 7000);


    Scanner inputStatus = new Scanner(System.in);

    System.out.println("Podaj status zamówienia do wyswietlenia:  NEW, PAID, SHIPPED, DELIVERED, CANCELED");

    String userStatus = inputStatus.nextLine().toUpperCase();

    ;

    Order order = new Order(Status.NEW, "Laptopaaaaa", 7000);

    Order[] showOrders = order.showOrders(orders, Status.valueOf(userStatus));

    for (Order o : showOrders) {
      System.out.println(o.toString());
    }


//
//    System.out.println(showOrders[0].toString());
//    System.out.println(showOrders[1].toString());

  }
}

