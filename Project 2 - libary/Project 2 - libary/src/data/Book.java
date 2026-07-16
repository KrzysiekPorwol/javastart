package data;

public class Book {
  String title;
  String author;
  int releaseDate;
  int pages;
  String publisher;
  String isbn;

 public Book(String newTitle, String newAuthor, int newReleaseDate,
       int newPages, String newPublisher, String newIsbn) {

    title = newTitle;
    author = newAuthor;
    releaseDate = newReleaseDate;
    pages = newPages;
    publisher = newPublisher;
    isbn = newIsbn;
  }

 public void printInfo() {
    String printInfo = title + " | " + author + " | " + releaseDate  + " | "
          + pages  + " | " + publisher  + " | " + isbn;
    System.out.println(printInfo);
  }
}
