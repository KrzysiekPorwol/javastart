package pl.javastart.library.model;

import pl.javastart.library.interfaces.Shape;

public class Triangle implements Shape {

  private int a;
  private int b;
  private int c;
  private int h;

  public Triangle(int a, int b, int c, int h) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.h = h;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
  }

  public int getH() {
    return h;
  }

  public void setH(int h) {
    this.h = h;
  }

  @Override
  public double surfaceArea() {
    return (0.5 * a) * h;
  }

  @Override
  public double perimeter() {
    return a + b + c;
  }
}
