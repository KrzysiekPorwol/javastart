package pl.javastart.library.app;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class App {

  static void main() {
    Scanner input = new Scanner(System.in);
    System.out.println("W celu rozpoczecia odliczania czasu nalezy wcisnąc enter");
    input.nextLine();
    Instant actualTime1 = Instant.now();
    System.out.println("W celu zakonczenia odliczania czasu nalezy wcisnąc enter");
    input.nextLine();
    Instant actualTime2 = Instant.now();

    Duration duration = Duration.between(actualTime1, actualTime2);

    System.out.println(duration.getSeconds());



  }

}
