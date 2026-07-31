package pl.javastart.library.app;

import pl.javastart.library.model.Course.CourseOffline;
import pl.javastart.library.model.Course.CourseOnlineWithBootcamp;

public class CourseApp {

  static void main() {

    CourseOffline courseOfflineJava = new CourseOffline();

    courseOfflineJava.setCourseId("JAVA-OFFLINE-001");
    courseOfflineJava.setLocality("Radlin");
    courseOfflineJava.setHowManyClasses(5);
    courseOfflineJava.setName("Java");

    CourseOnlineWithBootcamp courseJava = new CourseOnlineWithBootcamp();

    //Systemoutprint...



  }

}
