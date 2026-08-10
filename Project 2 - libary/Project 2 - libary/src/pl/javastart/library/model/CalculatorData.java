package pl.javastart.library.model;

import java.util.Objects;

public class CalculatorData {
  double userNumber1;
  char userOperator;
  double userNumber2;

  public double getUserNumber1() {
    return userNumber1;
  }

  public void setUserNumber1(double userNumber1) {
    this.userNumber1 = userNumber1;
  }

  public char getUserOperator() {
    return userOperator;
  }

  public void setUserOperator(char userOperator) {
    this.userOperator = userOperator;
  }

  public double getUserNumber2() {
    return userNumber2;
  }

  public void setUserNumber2(double userNumber2) {
    this.userNumber2 = userNumber2;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    CalculatorData that = (CalculatorData) o;
    return Double.compare(userNumber1, that.userNumber1) == 0 && userOperator == that.userOperator && Double.compare(userNumber2, that.userNumber2) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(userNumber1, userOperator, userNumber2);
  }
}
