public class CalcTest {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int calculatorAdd2Numbers = calculator.add(5, 10);
    System.out.println("Wynik dodawania dwoch liczb " + calculatorAdd2Numbers);
    int calculatorAdd3Numbers = calculator.add(5, 10, 15);
    System.out.println("Wynik dodawania trzech liczb " + calculatorAdd3Numbers);
    int calculatorSubtract2Numbers = calculator.subtract(10, 5);
    System.out.println("Wynik odejmowania dwoch liczb " + calculatorSubtract2Numbers);
    int calculatorSubtract3Numbers = calculator.subtract(10, 5, 3);
    System.out.println("Wynik odejmowania trzech liczb " + calculatorSubtract3Numbers);
  }
}
