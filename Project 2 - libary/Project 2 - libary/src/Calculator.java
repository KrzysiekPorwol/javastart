public class Calculator {

  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return this.add(a, b) + c;
  }

  int subtract(int a, int b) {
    return a - b;
  }

  int subtract(int a, int b, int c) {
    return this.subtract(a, b) - c;
  }
}

/*
Napisz program — kalkulator, który będzie składał się z dwóch klas:

Calculator,
CalcTest.
W klasie Calculator zdefiniuj metody add (dodaj) i subtract (odejmij) w kilku przeciążonych wersjach,
aby mogły dodawać lub odejmować 2 lub 3 liczby (a+b+c lub a-b-c) wybranego przez Ciebie typu liczbowego.

W klasie CalcTest przetestuj działanie klasy Calculator.
* */