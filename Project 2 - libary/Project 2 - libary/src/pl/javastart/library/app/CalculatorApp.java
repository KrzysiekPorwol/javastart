package pl.javastart.library.app;

import pl.javastart.library.logic.CalculatorMath;
import pl.javastart.library.logic.CalculatorTalk;
import pl.javastart.library.model.CalculatorData;

import java.util.Scanner;

public class CalculatorApp {

  static void main() {

    CalculatorTalk calculatorTalk = new CalculatorTalk();

    CalculatorData calculatorData = calculatorTalk.calculatorTalk();
    CalculatorMath calculatorMath = new CalculatorMath();


    System.out.println(calculatorMath.math(calculatorData.getUserNumber1(), calculatorData.getUserNumber2(), calculatorData.getUserOperator()));

  }

}
