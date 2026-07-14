public class Calculate {
  public static void main(String[] args) {
    double a = 15.5;
    double b = 2;

    Calculator calculator = new Calculator();

    double add = calculator.add(a, b);
    double subtract = calculator.subtract(a, b);
    double multiply = calculator.multiply(a, b);
    double divide = calculator.divide(a, b);

    System.out.println(add + " " + subtract + " " + multiply + " " + divide);
  }
}



//Calculate.java - tutaj umieść klasę testową z metodą main(). Zadeklaruj i zainicjuj w niej
// co najmniej 2 zmienne typu double, utwórz obiekt klasy Calculator i za jego pomocą oblicz
// wynik różnych działań matematycznych.
//Wszystkie wyniki działań wyświetl na ekranie.