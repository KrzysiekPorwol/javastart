package pl.javastart.library.app;

import pl.javastart.library.model.Student;

public class University {

  public static void main() {
    Student student1 = new Student("Krzysztof", "Porwol", 1);
    Student student2 = new Student("Dawid", "Porwol", 2);

    System.out.println("Liczba studentów na uczelni to: " + Student.getHowManyStudents());
  }
}
