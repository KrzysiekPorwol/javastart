package pl.javastart.library.model;

import java.util.Arrays;

public class PersonDataBase {

  private Person[] personArray = new Person[1];
  private int size = 0;

  public void add(Person person) {
    if (person == null) {
      throw new NullPointerException("Przekazany obiekt person nie moze być Null");
    } else {
      if (personArray.length == size) {
        personArray = Arrays.copyOf(personArray, (size * 2));
      }
      personArray[size] = person;
      size++;
    }
  }


  public void remove(Person person) {
    if (person == null) {
      throw new NullPointerException("Przekazany obiekt person nie moze być Null");
    } else {

      for (int i = 0; i < size; i++) {
        if (person.equals(personArray[i])) {
          size--;
          for (int j = i; j < size - 1; j++) {
            personArray[j] = personArray[j + 1];
          }
          personArray[size - 1] = null;
          size--;
          break;
        }
      }
    }
  }

  public Person get(int index) {
    return personArray[index];
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    return "PersonDataBase{" +
          "personArray=" + Arrays.toString(personArray) +
          ", size=" + size +
          '}';
  }
}
