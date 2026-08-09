package pl.javastart.library.app;

import pl.javastart.library.model.Dice;

import java.util.Random;
import java.util.Scanner;

public class DiceApp {

  static void main() {
    System.out.println("Wcisnij enter aby rzucic kostką: ");

    Scanner input = new Scanner(System.in);

    input.nextLine();

    Random lottery = new Random();
    int lotteryNumber = lottery.nextInt(6) + 1;

    Dice dice = new Dice();

    if (lotteryNumber == 1) {
      System.out.println(dice.getDice1());
    } else if (lotteryNumber == 2) {
      System.out.println(dice.getDice2());
    } else if (lotteryNumber == 3) {
      System.out.println(dice.getDice3());
    } else if (lotteryNumber == 4) {
      System.out.println(dice.getDice4());
    } else if (lotteryNumber == 5) {
      System.out.println(dice.getDice5());
    } else {
      System.out.println(dice.getDice6());
    }
  }
}


//Napisz program, który będzie symulował rzut kostką. Po jego uruchomieniu powinien wyświetlić się tekst
//"Wciśnij Enter, aby rzucić kostką". Po wciśnięciu entera w konsoli powinna wyświetlić się kostka z losową
//liczbą oczek. Kostka powinna wyglądać w sposób zbliżony do tej przedstawionej poniżej.

//Do zdefiniowania ścian kostki wykorzystaj specyfikację Text Blocks. Każdą ze ścianek umieść w tablicy
//i zdefiniuj odpowiednią metodę losującą.

