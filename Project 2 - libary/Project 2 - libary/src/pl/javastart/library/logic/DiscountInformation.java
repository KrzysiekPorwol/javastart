package pl.javastart.library.logic;

import pl.javastart.library.model.Client;

public class DiscountInformation {

public void discountInformationForPerson(Client client, double price, double priceDiscount) {
    if (client.getLastName() == null && client.getFirstName() != null) {
      System.out.println("Witaj " + client.getFirstName());
    } else if (client.getFirstName() != null && client.getLastName() != null) {
      System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
    } else if (client.getFirstName() == null && client.getLastName() != null) {
      System.out.println("Dzień dobry panie/pani " + client.getLastName());
    } else if (client.getFirstName() == null && client.getLastName() == null) {
      System.out.println("Witaj nieznajomy");
    }
    System.out.println("Kwota przed rabatem: " + price);
  System.out.println("Do zapłaty (po rabacie): " + priceDiscount);

  }



}

//    System.out.println("Witaj " + client1.getFirstName() + " " + client1.getLastName());
//      System.out.println("Kwota przed rabatem: " + price1);
//    System.out.println("Do zapłaty (po rabacie): " + priceDiscount1);
//
//    System.out.println("Witaj " + client2.getFirstName() + " " + client2.getLastName());
//      System.out.println("Kwota przed rabatem: " + price2);
//    System.out.println("Do zapłaty (po rabacie): " + priceDiscount2);
