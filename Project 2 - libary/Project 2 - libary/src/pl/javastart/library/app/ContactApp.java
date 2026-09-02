package pl.javastart.library.app;

import pl.javastart.library.logic.ContactReader;
import pl.javastart.library.model.Contact;
import pl.javastart.library.model.ContactManager;

import java.util.Optional;
import java.util.Scanner;

class ContactApp {
  public static void main(String[] args) {
    Optional<ContactManager> contactManagerOpt =
          ContactReader.readFile("/Users/krzysztofporwol/javastart/contacts.csv");

    // 1. przypadek: brak pliku
    if (contactManagerOpt.isEmpty()) {
      System.out.println("Nie znaleziono pliku z kontaktami");
      return;   // kończymy program
    }

    // tu już wiemy, że plik jest — get() jest bezpieczny
    ContactManager contactManager = contactManagerOpt.get();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj adres email do wyszukania kontaktu:");
    String email = scanner.nextLine();

    Optional<Contact> contactByEmail = contactManager.findByEmail(email);

    // 2. przypadek: brak kontaktu o danym email
    System.out.println("Kontakt o wskazanym adresie email:");
    contactByEmail.ifPresentOrElse(
          contact -> System.out.println(contact.getShortInfo()),
          () -> System.out.println("Brak kontaktu o wskazanym adresie email")
    );
  }
}