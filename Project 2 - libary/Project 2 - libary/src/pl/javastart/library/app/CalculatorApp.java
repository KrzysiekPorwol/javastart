package pl.javastart.library.app;

import java.util.Scanner;

import static pl.javastart.library.io.UserChoice.*;

public class CalculatorApp {


  static void main() {
    Scanner input = new Scanner(System.in);
    int userChoise;
    System.out.println("Wybierz 1, jesli chcesz obliczyc pole  i obwod prostokata, 2 jesli trojkata, i 3 jesli koła.");
    userChoise = input.nextInt();
    input.nextLine();
    if (userChoise == 1) {
      userChoice1();
    } else if (userChoise == 2) {
      userChoice2();
    } else if (userChoise == 3) {
      userChoice3();
    }
  }

}

//Napisz program rozszerzający możliwości przykładu z lekcji. Stwórz kalkulator komunikujący się z
//użytkownikiem i pobierający od niego dane, który pozwala na wyliczenie pola i obwodu prostokąta, trójkąta i koła.
//
//Program powinien wykorzystywać co najmniej jeden interfejs.