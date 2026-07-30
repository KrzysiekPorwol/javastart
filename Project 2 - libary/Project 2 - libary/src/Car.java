public class Car {
  String carBrand;
  int yearOfManufacture;
  int carMileage;

  public void carInfo() {
    System.out.println("Marka: " + carBrand + " rok produkcji: " + yearOfManufacture + " przebieg: " + carMileage);
  }

}


//Zdefiniuj klasę Samochod, która przechowuje: markę (tekst), rok produkcji (liczba całkowita)
//oraz przebieg w km (liczba całkowita). Dodaj metodę wyswietlInfo(), która wypisuje wszystkie
//dane pojazdu w jednej linii. Wyjaśnij przy okazji: czym różni się klasa od obiektu?