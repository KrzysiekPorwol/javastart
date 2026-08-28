package pl.javastart.library.app;

import java.util.Collections;

public class App {

  static void main() {
    MathOperation addition = (a, b) -> a + b;
    MathOperation subtraction = (a, b) -> a - b;
    MathOperation divide = (a, b) -> {
      if (b == 0) {
        System.out.print("Nie można dzielić przez 0!");
      }
      return a / b;
    };
    MathOperation multiplier = (a, b) -> a * b;

    forAll(addition, 15, 10, "Dodawanie: ");

  }

  public static void forAll(MathOperation mathOperation, int a, int b, String podpis) {
    int result = mathOperation.calculate(a, b);
    System.out.print(podpis + " " + result);
  }


}
