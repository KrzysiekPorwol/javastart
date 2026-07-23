package pl.javastart.library.model;

public class Elevator {
  private Person[] people = new Person[4];
  private int peopleNumber = 0;
  private final int maxWeight = 400;

  public void add(Person person) {
    if (peopleNumber < 4) {
      people[peopleNumber] = person;
      peopleNumber++;
    } else {
      System.out.println("W windzie nie ma już miejsca");
    }
  }

  public void start() {
    if (getTotalWeight() <= maxWeight) {
      System.out.println("Winda ruszyła!");
    } else {
      System.out.println("Winda jest przeciążona o " + (getTotalWeight() - maxWeight) + "kg");
    }
  }

  public int getTotalWeight() {
    if (people[3] != null) {
      return people[0].getWeight() + people[1].getWeight() + people[2].getWeight() + people[3].getWeight();
    } else if (people[2] != null) {
      return people[0].getWeight() + people[1].getWeight() + people[2].getWeight();
    } else if (people[1] != null) {
      return people[0].getWeight() + people[1].getWeight();
    } else if (people[0] != null) {
      return people[0].getWeight();
    } else {
      return 0;
    }
  }


  public void clear() {
    people[0] = null;
    people[1] = null;
    people[2] = null;
    people[3] = null;
    peopleNumber = 0;
    System.out.println("Winda jest pusta");
  }
}

//Employee[] employees = new Employee[20];

//Później stwórz klasę, która będzie reprezentowała windę. Do windy mogą wejść maksymalnie 4 osoby
//      (ale może ich też być mniej). W klasie zdefiniuj pole, które będzie tablicą, do której
//można dodawać obiekty reprezentujące osoby. Pole powinno być prywatne, a dodawanie osób powinno
//odbywać się poprzez dedykowaną metodę add(). Jeżeli do windy będzie próbowała wsiąść piąta osoba,
//to wyświetl komunikat, że w windzie nie ma już miejsca.

//Dodaj także metodę start(), która uruchamia windę. Zanim winda rozpocznie jednak podróż,
//powinna nastąpić weryfikacja całkowitego obciążenia windy. Jeżeli będzie ono większe niż 400 kg,
//to powinien wyświetlić się komunikat o tym, że winda jest przeciążona (wraz z informacją o ile kilogramów).
//Jeżeli osoby w windzie ważą łącznie mniej niż 400 kg, to wyświetl komunikat "winda wystartowała".
//Ostatnia metoda w klasie windy powinna symulować opróżnienie windy (wszystkie osoby wysiadają i na
//      ich miejsce mogą wejść inne), po jej wywołaniu wyświetl komunikat, że winda jest pusta.

