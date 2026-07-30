public class Car2 {
  private String carBrand;
  private int yearOfManufacture;
  private int carMileage = 0;

  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public int getYearOfManufacture() {
    return yearOfManufacture;
  }

  public void setYearOfManufacture(int yearOfManufacture) {
    this.yearOfManufacture = yearOfManufacture;
  }

  public int getCarMileage() {
    return carMileage;
  }

  public void setCarMileage(int carMileage) {
    if (this.carMileage <= carMileage) {
      this.carMileage = carMileage;
    } else {
      System.out.println("Samochód nie może mieć mniejszego przebiegu niż już ma!");
    }
  }

  public Car2(String carBrand, int yearOfManufacture, int carMileage) {
    this.carBrand = carBrand;
    this.yearOfManufacture = yearOfManufacture;
    this.carMileage = carMileage;
  }

  public Car2(String carBrand, int yearOfManufacture) {
    this.carBrand = carBrand;
    this.yearOfManufacture = yearOfManufacture;
  }

  void carInfo() {
    System.out.println("Model: " + getCarBrand() + " Rocznik: " + getYearOfManufacture() + " Przebieg: " + getCarMileage());
  }
}
