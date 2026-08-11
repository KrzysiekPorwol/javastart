package pl.javastart.library.model;

import pl.javastart.library.interfaces.Shape;

public class Circle implements Shape {
  private int r;

  public Circle(int r) {
    this.r = r;
  }

  public int getR() {
    return r;
  }

  public void setR(int r) {
    this.r = r;
  }

  @Override
  public double surfaceArea() {
    return Shape.Pi * (r * r);
  }

  @Override
  public double perimeter() {
    return 2 * Shape.Pi * r;
  }
}
