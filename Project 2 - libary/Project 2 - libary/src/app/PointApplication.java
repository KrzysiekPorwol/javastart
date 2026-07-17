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

    Point point2 = new Point(2, 2);

    System.out.println("Wybierz o ile ma się zwiększyć wartość x na wykresie: 1, 2, 3, 4 a może 5?");
    int increaseNumber = 5;

    switch (increaseNumber) {
      case 1:
        pointController1.addX(point2);
        break;
      case 2:
        pointController1.addX(point2);
        pointController1.addX(point2);
        break;
      case 3:
        pointController1.addX(point2);
        pointController1.addX(point2);
        pointController1.addX(point2);
        break;
      case 4:
        pointController1.addX(point2);
        pointController1.addX(point2);
        pointController1.addX(point2);
        pointController1.addX(point2);
        break;
      case 5:
        pointController1.addX(point2);
        pointController1.addX(point2);
        pointController1.addX(point2);
        pointController1.addX(point2);
        pointController1.addX(point2);
        break;
    }

    System.out.println(point2.getX() + " " + point2.getY());

  }
}
