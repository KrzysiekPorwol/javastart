package pl.javastart.library.model;

//Pomimo że w klasie BankAccount zdefiniowana jest metoda equals(), to przy porównywaniu dwóch identycznych kont bankowych,
//  należących do takich samych klientów, z takimi samymi adresami, wynikiem jest false. Popraw kod w taki sposób, aby przy
//porównywaniu identycznych kont bankowych, należących do takich samych klientów z takimi samymi adresami, wynikiem porównania
//była wartość true. Jeżeli co najmniej jedno pole w koncie bankowym, danych klienta lub adresu będą różne, to porównanie
//powinno zwracać false.

import java.util.Objects;

public class Address {
  private String city;
  private String street;
  private String postalCode;
  private String homeNo;
  private String flatNo;

  public Address(String city, String street, String postalCode, String homeNo, String flatNo) {
    this.city = city;
    this.street = street;
    this.postalCode = postalCode;
    this.homeNo = homeNo;
    this.flatNo = flatNo;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getHomeNo() {
    return homeNo;
  }

  public void setHomeNo(String homeNo) {
    this.homeNo = homeNo;
  }

  public String getFlatNo() {
    return flatNo;
  }

  public void setFlatNo(String flatNo) {
    this.flatNo = flatNo;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Address address = (Address) o;
    return Objects.equals(city, address.city) && Objects.equals(street, address.street) && Objects.equals(postalCode, address.postalCode) && Objects.equals(homeNo, address.homeNo) && Objects.equals(flatNo, address.flatNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, street, postalCode, homeNo, flatNo);
  }
}