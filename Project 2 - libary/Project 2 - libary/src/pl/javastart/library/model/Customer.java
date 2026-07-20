package pl.javastart.library.model;

public class Customer {

  String firstName;
  private String lastName;
  private int age;
  private int ticketId;

  public Customer(String firstName, String lastName, int age, int ticketId) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.ticketId = ticketId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getTicketId() {
    return ticketId;
  }

  public void setTicketId(int ticketId) {
    this.ticketId = ticketId;
  }
}


//
//String firstName1 = "Jan";
//String lastName1 = "Kowalski";
//int age1 = 15;
//int ticket1Id = 0;
