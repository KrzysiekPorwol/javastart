package pl.javastart.library.logic;

import pl.javastart.library.model.Customer;
import pl.javastart.library.model.Movie;
import pl.javastart.library.model.Ticket;

public class BuyTicket {
 public Ticket BuyTicket(Movie movie, Customer customer){
    if (movie.getFreeSeats() == 0) {
      System.out.println("Brak wolnych miejsc na wskazany seans");
      return null;
    } else if (customer.getAge() < movie.getAgeRequired()) {
      System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
      return null;
    } else {
      int ticketId = movie.getMaxSeats() - movie.getFreeSeats() + 1;
      movie.setFreeSeats(movie.getFreeSeats() - 1);
      return new Ticket(ticketId, movie, customer);
    }
  }
}

//public class BuyTicket {
//  public Ticket buyTicket(Movie movie, Customer customer) {
//    if (movie.getFreeSeats() == 0) {
//      System.out.println("Brak wolnych miejsc na seans");
//      return null;
//    } else if (customer.getAge() < movie.getAgeRequired()) {
//      System.out.println("Nie sprzedano biletu osobie " + customer.getFirstName() + ". Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
//      return null;
//    } else {
//      Ticket ticket = new Ticket(movie.getMovieTitle(), customer.getLastName(), customer.getTicketId());
//      movie.setFreeSeats(movie.getFreeSeats() - 1);
//      System.out.println("Sprzedano bilet na film " + movie.getMovieTitle() + " osobie o nazwisku " + customer.getLastName());
//      return ticket;
//    }
//  }
//}