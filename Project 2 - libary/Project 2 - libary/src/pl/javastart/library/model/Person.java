package pl.javastart.library.model;

public class Person {

  private int id;
  private int weight;

  public Person(int id, int weight) {
    this.id = id;
    this.weight = weight;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}

//Na początku zdefiniuj klasę, która reprezentuje jakąś osobę. Nie potrzebujemy tutaj żadnych
//      danych osobowych, wystarczy nam identyfikator (np. kolejna liczba całkowita)
//oraz waga danej osoby.