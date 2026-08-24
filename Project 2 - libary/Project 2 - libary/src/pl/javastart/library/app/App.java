package pl.javastart.library.app;

import pl.javastart.library.model.Person;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class App {


  static void main() {

    Person person1 = new Person("Adam", "porwol", 40);
    Person person2 = new Person("Zdam", "adamczyk", 30);
    Person person3 = new Person("Bdam", "kuzik", 50);
    Person person4 = new Person("Gdam", "folczyk", 60);
    Person person5 = new Person("Rdam", "cipenes", 70);

    TreeMap<String, Person> personMap = new TreeMap<>();

    personMap.put(person1.getLastName(), person1);
    personMap.put(person2.getLastName(), person2);
    personMap.put(person3.getLastName(), person3);
    personMap.put(person4.getLastName(), person4);
    personMap.put(person5.getLastName(), person5);

    Iterator<Person> iterator = personMap.values().iterator();


    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }




  }
}
