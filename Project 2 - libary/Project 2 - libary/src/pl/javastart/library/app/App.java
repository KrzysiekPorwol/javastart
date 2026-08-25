package pl.javastart.library.app;

import pl.javastart.library.logic.ChoiceNumbers;
import pl.javastart.library.model.Lotto;

import java.util.ArrayList;

public class App {

  static void main() {
    Lotto lotto = new Lotto();
    ChoiceNumbers choiceNumbers = new ChoiceNumbers();

    lotto.generate();

    lotto.randomize();

    ArrayList<Integer> userNumbers = choiceNumbers.userInput();
    System.out.println(lotto.toString());
    System.out.println(choiceNumbers.toString());
    System.out.println("Liczba pasujących Twoich liczb z wylosowanymi: " + lotto.checkResult(userNumbers));
  }
}
