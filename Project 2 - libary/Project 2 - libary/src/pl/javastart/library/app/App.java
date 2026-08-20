package pl.javastart.library.app;

import pl.javastart.library.model.Person;
import pl.javastart.library.model.PersonDataBase;

public class App {

  static void main() {
    PersonDataBase personDataBase = new PersonDataBase();

    personDataBase.add(new Person("Krzychu1", "Porwol1", "12345"));
    personDataBase.add(new Person("Krzychu2", "Porwol2", "22345"));
    personDataBase.add(new Person("Krzychu3", "Porwol3", "32345"));
    personDataBase.add(new Person("Krzychu4", "Porwol3", "32345"));
    personDataBase.add(new Person("Krzychu5", "Porwol3", "32345"));

    System.out.println(personDataBase.toString());

    personDataBase.remove(new Person("Krzychu2", "Porwol2", "22345"));

    System.out.println(personDataBase.toString());



  }

}
