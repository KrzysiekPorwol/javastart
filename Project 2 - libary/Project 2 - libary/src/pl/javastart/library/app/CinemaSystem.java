package pl.javastart.library.app;

import pl.javastart.library.logic.BuyTicket;
import pl.javastart.library.model.Customer;
import pl.javastart.library.model.Movie;
import pl.javastart.library.model.Ticket;

class CinemaSystem {
  public static void main(String[] args) {
    Movie movie1 = new Movie("Omen", "horror", 128, 16, 72, 72);
    Customer customer1 = new Customer("Krzysztof", "Porwoł", 28);
    BuyTicket buyTicket = new BuyTicket();
    Ticket ticket1 = buyTicket.BuyTicket(movie1, customer1);

    Customer customer2 = new Customer("Kacper", "Wajsman", 17);
    Ticket ticket2 = buyTicket.BuyTicket(movie1, customer2);

    System.out.println("Sprzedane bilety");
    if (ticket1 != null) {
      System.out.println(ticket1.getInfo());
    }
    if (ticket2 != null) {
      System.out.println(ticket2.getInfo());
    }

    System.out.println("Liczba pozostałych miejsc: " + movie1.getFreeSeats());
    System.out.println("Liczba sprzedanych biletów: " + (movie1.getMaxSeats() - movie1.getFreeSeats()));
  }
}