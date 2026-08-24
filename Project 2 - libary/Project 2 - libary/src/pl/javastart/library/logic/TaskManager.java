package pl.javastart.library.logic;

import pl.javastart.library.model.Priority;
import pl.javastart.library.model.Task;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {

  Queue<Task> queueTasks = new PriorityQueue<>();
  Scanner input = new Scanner(System.in);

  public void appMenu() {
    System.out.println("Wpisz: 0 - wyjscie z apki, 1 - dodaj zadanie, 2 - pobierz zadanie do wykonania");
    int userinput = input.nextInt();
    input.nextLine();
    if (userinput == 0) {
      leaveApp();
    } else if (userinput == 1) {
      addTask();
      appMenu();
    } else if (userinput == 2) {
      showNextTask();
      appMenu();
    }
  }

  public void addTask() {
    System.out.println("Dodaj zadanie");
    System.out.println("Nazwa zadania: ");
    String name = input.nextLine();
    System.out.println("Opis zadania: ");
    String description = input.nextLine();
    System.out.println("Ważność zadania: 0 - standardowe, 1 - ważne, 2 - super ważne");
    int priority = input.nextInt();
    input.nextLine();
    if (priority == 2) {
      queueTasks.offer(new Task(name, description, Priority.HIGH));
    } else if (priority == 1) {
      queueTasks.offer(new Task(name, description, Priority.MODERATE));
    } else if (priority == 0) {
      queueTasks.offer(new Task(name, description, Priority.LOW));
    }
  }

  public void leaveApp() {
    System.out.println("Papa!");
  }

  public void showNextTask() {
    System.out.println(queueTasks.peek());
  }


}
