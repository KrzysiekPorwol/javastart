package pl.javastart.application;

import pl.javastart.logic.Charger;
import pl.javastart.model.Telephone;

class PhoneTest {
  public static void main(String[] args) {
    Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);

    System.out.println(telephone.telephoneInfo());

    Charger charger = new Charger();
    charger.charge(telephone);

    System.out.println(telephone.telephoneInfo());
  }
}