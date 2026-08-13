package pl.javastart.library.model;

public class Client {
  private int id;
  private String first_name;
  private String lastName;
  private String country;
  private double valueCustomer;

  public Client(int id, String firstName, String lastName, String country, double valueCustomer) {
    this.id = id;
    this.first_name = firstName;
    this.lastName = lastName;
    this.country = country;
    this.valueCustomer = valueCustomer;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirst_name() {
    return first_name;
  }

  public void setFirst_name(String first_name) {
    this.first_name = first_name;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public double getValueCustomer() {
    return valueCustomer;
  }

  public void setValueCustomer(double valueCustomer) {
    this.valueCustomer = valueCustomer;
  }

  @Override
  public String toString() {
    return "Client{" +
          "id=" + id +
          ", first_name='" + first_name + '\'' +
          ", lastName='" + lastName + '\'' +
          ", country='" + country + '\'' +
          ", valueCustomer=" + valueCustomer +
          '}';
  }
}



//Każdy wiersz w pliku reprezentuje pojedynczego klienta i dostępne są o nim takie informacje jak id, imię, nazwisko, kraj
//pochodzenia i łączna wartość zakupów, które dany klient u nas zrobił (nazwijmy to "wartością danego klienta").