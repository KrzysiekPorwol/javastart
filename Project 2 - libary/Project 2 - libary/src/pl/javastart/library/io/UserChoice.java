package pl.javastart.library.io;

import pl.javastart.library.model.Circle;
import pl.javastart.library.model.Rectangle;
import pl.javastart.library.model.Triangle;

import java.util.Scanner;

public class UserChoice {

  static public void userChoice1() {
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    System.out.println("Podaj dlugosc podstawy: ");
    a = input.nextInt();
    input.nextLine();
    System.out.println("Podaj dlugosc boku: ");
    b = input.nextInt();
    Rectangle rectangle = new Rectangle(a, b);
    System.out.println(rectangle.surfaceArea());
    System.out.println(rectangle.perimeter());
  }

  static public void userChoice2() {
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    int c;
    int h;
    System.out.println("Podaj dlugosc podstawy: ");
    a = input.nextInt();
    input.nextLine();
    System.out.println("Podaj dlugosc boku: ");
    b = input.nextInt();
    input.nextLine();
    System.out.println("Podaj dlugosc drugiego boku: ");
    c = input.nextInt();
    input.nextLine();
    System.out.println("Podaj wysokosc: ");
    h = input.nextInt();
    input.nextLine();
    Triangle triangle = new Triangle(a, b, c, h);
    System.out.println(triangle.surfaceArea());
    System.out.println(triangle.perimeter());
  }

  static public void userChoice3() {
    Scanner input = new Scanner(System.in);
    int r;
    System.out.println("Podaj promień koła: ");
    r = input.nextInt();
    input.nextLine();
    Circle circle = new Circle(r);
    System.out.println(circle.surfaceArea());
    System.out.println(circle.perimeter());
  }
}
