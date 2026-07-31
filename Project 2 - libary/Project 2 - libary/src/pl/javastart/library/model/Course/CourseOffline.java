package pl.javastart.library.model.Course;

public class CourseOffline extends Course {
  private String locality;
  private int howManyClasses;

  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public int getHowManyClasses() {
    return howManyClasses;
  }

  public void setHowManyClasses(int howManyClasses) {
    this.howManyClasses = howManyClasses;
  }
}
