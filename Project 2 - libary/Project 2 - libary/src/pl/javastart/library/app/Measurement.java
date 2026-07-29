package pl.javastart.library.app;

public class Measurement {

  static int CUP = 250;
  static int SPOON = 15;
  static int TEASPOON = 5;

  static double milliliterCup(double cup) {
    return cup = cup * CUP;
  }

  static double milliliterSpoon(double spoon) {
    return spoon = spoon * SPOON;
  }

  static double milliliterTeaspoon(double teaspoon) {
    return teaspoon = teaspoon * TEASPOON;
  }

  static void main() {
    // Przepis składa się z 0.5 kubka cukru, 4 lyżek mąki, oraz 2 lyzeczek drozdzy.
    double sugar = 0.5;
    double flour = 4.5;
    double yeast = 2.5;
    System.out.println("Potrzebujesz " + milliliterCup(sugar) + " mililitrów cukru, do tego " + milliliterSpoon(flour)
    + " mililitrów mąki oraz " + milliliterTeaspoon(yeast) + " mililitrów drożdzy");
  }

}
