package pl.javastart.library.app;

import pl.javastart.library.logic.DiscountInformation;
import pl.javastart.library.logic.DiscountService;
import pl.javastart.library.model.Client;

public class DiscountApp {
  public static void main(String[] args) {
    Client client1 = new Client("Jan", "Kowalski", true);
    double price1 = 1100;

    Client client2 = new Client("Krzysztof", null, false);
    double price2 = 1100;

    DiscountService discountService = new DiscountService();
    double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
    double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

    DiscountInformation discountInformation = new DiscountInformation();

    discountInformation.discountInformationForPerson(client1, price1, priceDiscount1);
    discountInformation.discountInformationForPerson(client2, price2, priceDiscount2);
  }
}
