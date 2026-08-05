package pl.javastart.library.app;

//Pomimo że w klasie BankAccount zdefiniowana jest metoda equals(), to przy porównywaniu dwóch identycznych kont bankowych,
//  należących do takich samych klientów, z takimi samymi adresami, wynikiem jest false. Popraw kod w taki sposób, aby przy
//porównywaniu identycznych kont bankowych, należących do takich samych klientów z takimi samymi adresami, wynikiem porównania
//była wartość true. Jeżeli co najmniej jedno pole w koncie bankowym, danych klienta lub adresu będą różne, to porównanie
//powinno zwracać false.

import pl.javastart.library.model.Address;
import pl.javastart.library.model.BankAccount;
import pl.javastart.library.model.Client;

class BankTest {
  public static void main(String[] args) {
    Address address1 = new Address("Wrocław", "Hubska", "50-123", "23A", "15");
    Client client1 = new Client("Jan", "Kowalski", "88061056273", address1);
    BankAccount account1 = new BankAccount("32 2222 5673 8901 3232 4786 0001", client1, 2019);

    Address address2 = new Address("Wrocław", "Hubska", "50-123", "23A", "15");
    Client client2 = new Client("Jan", "Kowalski", "88061056273", address2);
    BankAccount account2 = new BankAccount("32 2222 5673 8901 3232 4786 0001", client2, 2019);

    if (account1.equals(account2)) {
      System.out.println("Konta bankowe są identyczne");
    } else {
      System.out.println("Konta bankowe są różne");
    }
  }
}
