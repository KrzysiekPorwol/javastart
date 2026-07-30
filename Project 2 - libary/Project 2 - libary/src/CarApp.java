public class CarApp {
  public static void main() {
    Car carFerrari = new Car();

    carFerrari.carMileage = 0;
    carFerrari.carBrand = "Ferrari";
    carFerrari.yearOfManufacture = 2026;

    carFerrari.carInfo();

    Car2 carMustang = new Car2("Mustang", 2026);

    carMustang.carInfo();
  }
}
