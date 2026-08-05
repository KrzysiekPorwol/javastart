package pl.javastart.library.model;

import java.util.Objects;

//Pomimo że w klasie BankAccount zdefiniowana jest metoda equals(), to przy porównywaniu dwóch identycznych kont bankowych,
//  należących do takich samych klientów, z takimi samymi adresami, wynikiem jest false. Popraw kod w taki sposób, aby przy
//porównywaniu identycznych kont bankowych, należących do takich samych klientów z takimi samymi adresami, wynikiem porównania
//była wartość true. Jeżeli co najmniej jedno pole w koncie bankowym, danych klienta lub adresu będą różne, to porównanie
//powinno zwracać false.

public class BankAccount {
  private String accountNumber;
  private Client owner;
  private int yearCreated;

  public BankAccount(String accountNumber, Client owner, int yearCreated) {
    this.accountNumber = accountNumber;
    this.owner = owner;
    this.yearCreated = yearCreated;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Client getOwner() {
    return owner;
  }

  public void setOwner(Client owner) {
    this.owner = owner;
  }

  public int getYearCreated() {
    return yearCreated;
  }

  public void setYearCreated(int yearCreated) {
    this.yearCreated = yearCreated;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    BankAccount that = (BankAccount) o;
    return yearCreated == that.yearCreated && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(owner, that.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, owner, yearCreated);
  }
}