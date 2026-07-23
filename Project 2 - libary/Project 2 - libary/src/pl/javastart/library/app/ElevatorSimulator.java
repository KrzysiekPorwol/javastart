package pl.javastart.library.app;

import pl.javastart.library.model.Elevator;
import pl.javastart.library.model.Person;

public class ElevatorSimulator {

  public static void main(String[] args) {

    Person person1 = new Person(1, 101);
    Person person2 = new Person(2, 101);
    Person person3 = new Person(3, 101);
    Person person4 = new Person(4, 101);
    Person person5 = new Person(5, 101);

    Elevator elevator = new Elevator();

    elevator.add(person1);
    elevator.add(person2);
    elevator.add(person3);
    elevator.add(person4);
    elevator.add(person5);
    elevator.start();
    elevator.clear();
    elevator.start();
    elevator.add(person1);
    elevator.add(person2);
    elevator.add(person3);
    elevator.start();

  }


}
