package pl.javastart.library.logic;

import pl.javastart.library.model.Data;

public class Calculations {

  public void calculate(Data data) {
    switch (data.getOperator()) {
      case "+" -> System.out.println(data.getA() + data.getB());
      case "-" -> System.out.println(data.getA() - data.getB());
      case "/" -> System.out.println(data.getA() / data.getB());
      case "*" -> System.out.println(data.getA() * data.getB());
    }
  }
}
