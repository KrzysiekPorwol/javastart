package pl.javastart.library.app;

import pl.javastart.library.model.Order2;
import pl.javastart.library.model.Status2;

import java.util.Locale;
import java.util.Scanner;

public class Orders2App {

  static void main() {

    Order2 order1 = new Order2(Status2.CANCELLED, "Laptop", 4500.50);
    Order2 order2 = new Order2(Status2.CANCELLED, "Laptopa", 4500.50);
    Order2 order3 = new Order2(Status2.CANCELLED, "Laptopaa", 4500.50);
    Order2 order4 = new Order2(Status2.NEW, "Laptopaaa", 4500.50);
    Order2 order5 = new Order2(Status2.NEW, "Laptopaaaaa", 4400.50);
    Order2 order6 = new Order2(Status2.PAID, "Laptopaaaaa", 4600.50);
    Order2 order7 = new Order2(Status2.DELIVERED, "Laptopaaaaaa", 4500.50);


    Order2[] orders = new Order2[7];

//    for (int i = 0; 7 > i; i++) {
//      orders[i] = order1;
//    }

    orders[0] = order1;
    orders[1] = order2;
    orders[2] = order3;
    orders[3] = order4;
    orders[4] = order5;
    orders[5] = order6;
    orders[6] = order7;

    Scanner input = new Scanner(System.in);

    System.out.println("Podaj status zamowien do wyswietlenia: ");

    String status = input.nextLine().toUpperCase(Locale.ROOT);

    Status2 status2 = Status2.valueOf(status);

   Order2[] statusOrders = Order2.showOrdersBasedStatus(orders, status2);

   for (Order2 c : statusOrders) {

     System.out.println(c.toString());
   }
  }
}
