package pl.javastart.library.model;

public class Ticket {
  private int ticketId;
  private Customer customer;
  private Movie movie;


  public Ticket(int ticketId, Movie movie, Customer customer) {
    this.ticketId = ticketId;
    this.movie = movie;
    this.customer = customer;
  }

  public String getInfo() {
    return ticketId + " | " + movie.getMovieInfo() + " | " + customer.getFullName();
  }

  public int getTicketId() {
    return ticketId;
  }

  public void setTicketId(int ticketId) {
    this.ticketId = ticketId;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
