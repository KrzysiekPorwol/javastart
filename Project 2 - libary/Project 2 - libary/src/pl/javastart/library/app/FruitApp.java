package pl.javastart.library.app;

import pl.javastart.library.model.Apple;
import pl.javastart.library.model.Fruit;

public class FruitApp {

  static void main() {
    Fruit fruit1 = new Fruit(30, "gruszkowy");

    System.out.println(fruit1.getInfo());

    Apple apple1 = new Apple(50,"Szampian");

    System.out.println(apple1.getInfo());
  }

}
