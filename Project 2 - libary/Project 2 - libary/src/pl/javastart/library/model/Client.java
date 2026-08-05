package pl.javastart.library.model;

import java.util.Objects;

//Pomimo że w klasie BankAccount zdefiniowana jest metoda equals(), to przy porównywaniu dwóch identycznych kont bankowych,
//  należących do takich samych klientów, z takimi samymi adresami, wynikiem jest false. Popraw kod w taki sposób, aby przy
//porównywaniu identycznych kont bankowych, należących do takich samych klientów z takimi samymi adresami, wynikiem porównania
//była wartość true. Jeżeli co najmniej jedno pole w koncie bankowym, danych klienta lub adresu będą różne, to porównanie
//powinno zwracać false.

public class Client {
  private String firstName;
  private String lastName;
  private String id;
  private Address address;

  public Client(String firstName, String lastName, String id, Address address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.address = address;
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

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Client client = (Client) o;
    return Objects.equals(firstName, client.firstName) && Objects.equals(lastName, client.lastName) && Objects.equals(id, client.id) && Objects.equals(address, client.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, id, address);
  }
}
