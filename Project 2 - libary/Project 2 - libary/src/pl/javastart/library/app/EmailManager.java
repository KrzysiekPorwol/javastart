package pl.javastart.library.app;

import pl.javastart.library.model.Email;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmailManager {
  public static void main(String[] args) {

    List<Email> emailList = createEmailList();

    //tylko wysłane emaile
    List<Email> sentEmails = filterEmailsBySent(emailList);
    System.out.println("Wysłane maile:");
    System.out.println(sentEmails);

    //filtrowanie maili, w których nadawca lub odbiorca ma wskazany adres email
    List<Email> bartEmails = filterEmailsBySenderOrRecipient(emailList, "bart@example.com");
    System.out.println("Maile przefiltrowane na podstawie nadawcy lub odbiorcy");
    System.out.println(bartEmails);



  }

  private static List<Email> filterEmails(List<Email> emails, Predicate<Email> predicate) {
    List<Email> filterEmails = new ArrayList<>();
    for (Email email : emails) {
      if (predicate.test(email))
        filterEmails.add(email);
    }
    return filterEmails;
  }

  private static List<Email> filterEmailsBySent(List<Email> emails) {
    Predicate<Email> predicate = (email -> email.isSent());
    return filterEmails(emails, predicate);
  }


  private static List<Email> filterEmailsBySenderOrRecipient(List<Email> emails, String emailAddress) {
    Predicate<Email> predicate2 = (email -> email.getSender().equals(emailAddress) || email.getRecipient().equals(emailAddress));
    return filterEmails(emails, predicate2);
  }


  private static List<Email> createEmailList() {
    List<Email> emails = new ArrayList<>();
    emails.add(new Email(
          "joe@example.com",
          "barbara@example.com",
          "Kup bułki",
          "Cześć!, Kup proszę bułki, gdy będziesz wracać z pracy.",
          false)
    );
    emails.add(new Email(
          "carl@example.com",
          "joe@example.com",
          "Nowa inwestycja",
          "Siema! Musimy omówić temat nowej inwestycji, pasuje Ci jutro?",
          true)
    );
    emails.add(new Email(
          "joe@example.com",
          "bart@example.com",
          "Wypad na miasto",
          "Cześć. Idziemy dzisiaj wieczorem z chłopakami na miasto. Dołączasz do nas?",
          true)
    );
    return emails;
  }
}
