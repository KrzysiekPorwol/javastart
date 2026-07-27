package pl.javastart.library.app;
import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;

public class Library {
  static void main(String[] args) {
    final String appName = "Biblioteka v0.8";

    Book[] books = new Book[1000];
    DataReader dataReader = new DataReader();

//    books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296, "Greg", "9788373271890");
//    books[1] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009, 352, "Helion",
//          "9788324620845");
//    books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra",
//          2008, 851, "McGraw-Hill Osborne Media");

    System.out.println(appName);
    System.out.println("Wprowadź pierwszą książkę: ");
    books[0] = dataReader.readAndCreateBook();
    System.out.println("Wprowadź drugą książkę: ");
    books[1] = dataReader.readAndCreateBook();


    books[0].printInfo();
    books[1].printInfo();
    System.out.println("System może przechowywać do " + books.length + " książek.");
  }
}