public class Bank {
  public static void main(String[] args) {
    RegisteredAddress registeredAddress1 = new RegisteredAddress();
    registeredAddress1.apartmentNumber = 1;
    registeredAddress1.houseNumber = 0;
    registeredAddress1.street = "Wąska";
    registeredAddress1.town = "Radlin";
    registeredAddress1.zipCode = 44-310;

    ResidentialAddress residentialAddress1 = new ResidentialAddress();
    residentialAddress1.apartmentNumber = registeredAddress1.apartmentNumber;
    residentialAddress1.houseNumber = registeredAddress1.houseNumber;
    residentialAddress1.street = registeredAddress1.street;
    residentialAddress1.town = registeredAddress1.town;
    residentialAddress1.zipCode = registeredAddress1.zipCode;

    ResidentialAddress residentialAddress2 = new ResidentialAddress();
    residentialAddress2.apartmentNumber = 2;
    residentialAddress2.houseNumber = 2;
    residentialAddress2.street = "Szeroka";
    residentialAddress2.town = "Rybnik";
    residentialAddress2.zipCode = 44-410;


    BankAccount bankAccount1 = new BankAccount();
    bankAccount1.balance = 1000;
    bankAccount1.owner.firstName = "Krzyszotf";
    bankAccount1.owner.lastName = "Porwoł";
    bankAccount1.owner.pesel = "11111111";
    bankAccount1.owner.registeredAddress = registeredAddress1;
    bankAccount1.owner.residentialAddress = residentialAddress1;

    BankAccount bankAccount2 = new BankAccount();
    bankAccount2.balance = 2000;
    bankAccount2.owner.firstName = "Dawid";
    bankAccount2.owner.lastName = "Porwoł";
    bankAccount2.owner.pesel = "22222222";
    bankAccount2.owner.registeredAddress = registeredAddress1;
    bankAccount2.owner.residentialAddress = residentialAddress2;

    System.out.println("Osoba 1:");
    System.out.println(bankAccount1.owner.firstName
          + " " + bankAccount1.owner.lastName
          + " " + bankAccount1.balance
          + " " + bankAccount1.owner.residentialAddress.town
          + " " + bankAccount1.owner.residentialAddress.street)
    ;

    System.out.println("Osoba 2:");
    System.out.println(bankAccount2.owner.firstName
          + " " + bankAccount2.owner.lastName
          + " " + bankAccount2.balance
          + " " + bankAccount2.owner.residentialAddress.town
          + " " + bankAccount2.owner.residentialAddress.street);
  }
}
