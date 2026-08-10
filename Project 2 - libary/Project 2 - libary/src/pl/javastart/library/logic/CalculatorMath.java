package pl.javastart.library.logic;

import pl.javastart.library.exception.UnknownOperatorException;

public class CalculatorMath {

  public double math(double userNumber1, double userNumber2, char userOperator) {
    if (userOperator == '+' || userOperator == '-' || userOperator == '/' || userOperator == '*') {
      if (userOperator == '+') {

        return userNumber1 + userNumber2;
      } else if (userOperator == '-') {
        return userNumber1 - userNumber2;
      } else if (userOperator == '*') {
        return userNumber1 * userNumber2;
      } else {
        if (userNumber2 == 0) {
          throw new ArithmeticException("Nie można dzielić przez 0");
        }
        return userNumber1 / userNumber2;
      }
    } else {
      throw new UnknownOperatorException("Operator jest niepoprawny");
    }
  }

  public double addition(double userNumber1, double userNumber2) {
    try {

      return userNumber1 + userNumber2;
    } catch (ArithmeticException ce) {
      System.out.println("Dzielnik nie moze byc liczba 0");
      return 0;
    }
  }

  public double subtraction(double userNumber1, double userNumber2, char userOperator) {
    if (userOperator == '+') {

    }
    return userNumber1 - userNumber2;
  }

  public double multiplication(double userNumber1, double userNumber2) {
    return userNumber1 * userNumber2;
  }

  public double division(double userNumber1, double userNumber2) {
    if (userNumber2 == 0) {
      throw new ArithmeticException("Nie można dzielić przez 0");
    }
    return userNumber1 / userNumber2;
  }
}
