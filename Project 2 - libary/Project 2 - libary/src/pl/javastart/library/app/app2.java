package pl.javastart.library.app;

import pl.javastart.library.logic.Addition2;
import pl.javastart.library.logic.UserInput2;

import java.util.ArrayList;

public class app2 {

  static void main() {

    UserInput2 userInput2 = new UserInput2();
    Addition2 addition2 = new Addition2();

    ArrayList<Integer> numbers = userInput2.userInput();

    System.out.println("Liczba wprowadzonych poprawnie liczb: " + numbers.size());
    System.out.println("Ich suma wynosi: " + addition2.addition2(numbers));
    System.out.println("Ich średnia wynosi: " + addition2.average2(numbers));



  }

}
