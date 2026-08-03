package pl.javastart.library.model;

public class Apple extends Fruit {

  private String fruitVariety;
  public static final String fruitType = "jabłkowaty";

  public Apple(int fruitWeight, String fruitVariety) {
    super(fruitWeight, fruitType);
    this.fruitVariety = fruitVariety;
  }

  public String getFruitVariety() {
    return fruitVariety;
  }

  public void setFruitVariety(String fruitVariety) {
    this.fruitVariety = fruitVariety;
  }

  public String getInfo() {
    return super.getInfo() + " Odmiana owocu: " + getFruitVariety();
  }
}
