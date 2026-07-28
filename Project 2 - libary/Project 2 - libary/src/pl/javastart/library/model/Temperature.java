package pl.javastart.library.model;

public class Temperature {
  private double currentTemperature;
  private double expectedTemperature;

  public double getCurrentTemperature() {
    return currentTemperature;
  }

  public void setCurrentTemperature(double currentTemperature) {
    this.currentTemperature = currentTemperature;
  }

  public double getExpectedTemperature() {
    return expectedTemperature;
  }

  public void setExpectedTemperature(double expectedTemperature) {
    this.expectedTemperature = expectedTemperature;
  }
}
