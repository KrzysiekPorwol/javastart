package app;

import data.Point;
import logic.PointController;

public class PointApplication {

  public static void main() {
    Point point1 = new Point(5, 10);
    PointController pointController1 = new PointController();

    System.out.println(point1.getX() + " " + point1.getY());

    pointController1.addX(point1);

    System.out.println(point1.getX() + " " + point1.getY());

    pointController1.minusY(point1);

    System.out.println(point1.getX() + " " + point1.getY());
  }
}
