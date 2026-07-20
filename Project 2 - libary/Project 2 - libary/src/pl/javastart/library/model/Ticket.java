package pl.javastart.library.model;

public class Ticket {
  private String ticketPersonData;
  private String ticketMovieTitle;
  private int ticketId;


  public Ticket(String ticketMovieTitle, String ticketPersonData, int ticketId) {
    this.ticketMovieTitle = ticketMovieTitle;
    this.ticketPersonData = ticketPersonData;
    this.ticketId = ticketId;
  }

  public int getTicketId() {
    return ticketId;
  }

  public void setTicketId(int ticketId) {
    this.ticketId = ticketId;
  }

  public String getTicketPersonData() {
    return ticketPersonData;
  }

  public void setTicketPersonData(String ticketPersonData) {
    this.ticketPersonData = ticketPersonData;
  }

  public String getTicketMovieTitle() {
    return ticketMovieTitle;
  }

  public void setTicketMovieTitle(String ticketMovieTitle) {
    this.ticketMovieTitle = ticketMovieTitle;
  }
}
