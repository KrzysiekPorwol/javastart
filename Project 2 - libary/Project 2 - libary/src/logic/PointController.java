package logic;

import data.Point;

public class PointController {
  public void addX(Point somePoint) {
    somePoint.setX(somePoint.getX() + 1);
  }

  public void addY(Point somePoint) {
    somePoint.setY(somePoint.getY() + 1);
  }

  public void minusX(Point somePoint) {
    somePoint.setX(somePoint.getX() - 1);
  }

  public void minusY(Point somePoint) {
    somePoint.setY(somePoint.getY() - 1);
  }
}
