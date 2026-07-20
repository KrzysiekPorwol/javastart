package pl.javastart.library.app;

import pl.javastart.library.logic.BuyTicket;
import pl.javastart.library.model.Customer;
import pl.javastart.library.model.Movie;
import pl.javastart.library.model.Ticket;

class CinemaSystem {
  public static void main(String[] args) {
    Movie movie1 = new Movie("Omen", "horror",
          128, 16, 72, 72);
    Customer customer1 = new Customer("Krzysztof", "Porwoł", 28, 1);
    BuyTicket buyTicket1 = new BuyTicket();

    buyTicket1.buyTicket(movie1, customer1);

    Customer customer2 = new Customer("Kacper", "Wajsman", 15, 2);
    buyTicket1.buyTicket(movie1, customer2);



//
//      System.out.println("Sprzedane bilety");
//    if (ticket1Id != 0) {
//      System.out.println(ticket1Id + " | " + ticket1PersonData + " | " + ticket1MovieTitle + " - " + movieType + " - " + movieTime + "min");
//    }
//    if (ticket2Id != 0) {
//      System.out.println(ticket2Id + " | " + ticket2PersonData + " | " + ticket2MovieTitle + " - " + movieType + " - " + movieTime + "min");
//    }
//
//    System.out.println("Liczba pozostałych miejsc: " + freeSeats);
//    System.out.println("Liczba sprzedanych biletów: " + (maxSeats - freeSeats));
  }
}
