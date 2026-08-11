package pl.javastart.library.model;

import pl.javastart.library.interfaces.Shape;

public class Rectangle implements Shape {
  private int a;
  private int b;

  public Rectangle(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  @Override
  public double surfaceArea() {
    return a * b;
  }

  @Override
  public double perimeter() {
    return a + a + b + b;
  }
}
