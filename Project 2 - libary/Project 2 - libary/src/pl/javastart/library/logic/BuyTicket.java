package pl.javastart.library.logic;

import pl.javastart.library.model.Customer;
import pl.javastart.library.model.Movie;
import pl.javastart.library.model.Ticket;

public class BuyTicket {
  public void buyTicket(Movie movie, Customer customer) {
    if (movie.getFreeSeats() == 0) {
      System.out.println("Brak wolnych miejsc na seans");
    } else if (customer.getAge() < movie.getAgeRequired()) {
      System.out.println("Nie sprzedano biletu osobie " + customer.getFirstName() + ". Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
    } else {
      Ticket ticket = new Ticket(customer.getFirstName(), customer.getLastName(), customer.getTicketId());
      movie.setFreeSeats(movie.getFreeSeats() - 1);
      System.out.println("Sprzedano bilet na film " + movie.getMovieTitle() + " osobie o nazwisku " + customer.getLastName());
    }
  }
}