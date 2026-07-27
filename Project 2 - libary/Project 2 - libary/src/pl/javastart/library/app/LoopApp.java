package pl.javastart.library.app;

import java.util.Scanner;

public class LoopApp {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Będziemy liczyć sumę liczb które wprowadzisz. Najpierw podaj ile tych liczb wprowadzisz: ");
    int howManyNumbers = input.nextInt();
    int liczba = 0;
    for (howManyNumbers = howManyNumbers; howManyNumbers > 0; howManyNumbers--) {
      System.out.print("Podaj swoją kolejną liczbe: ");
      liczba = liczba + input.nextInt();
    }
    System.out.print("Suma liczb to: " + liczba);
  }

}

//  Napisz program, który najpierw pobiera od użytkownika liczbę mówiącą o tym ile liczb chce
//wprowadzić. Następnie pobierz od niego tyle liczb ile zadeklarował, zsumuj je i wyświetl na ekranie wynik.
//W programie wykorzystaj co najwyżej dwie zmienne liczbowe (wliczając w to również potencjalne zmienne
//liczników pętli) i nie używaj tablic.