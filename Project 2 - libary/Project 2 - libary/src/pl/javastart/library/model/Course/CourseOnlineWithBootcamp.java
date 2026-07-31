package pl.javastart.library.model.Course;

public class CourseOnlineWithBootcamp extends CourseOnline {
  private String teacherFirstName;
  private String teacherLastName;
  private int timeWithTeacher;

  public String getTeacherFirstName() {
    return teacherFirstName;
  }

  public void setTeacherFirstName(String teacherFirstName) {
    this.teacherFirstName = teacherFirstName;
  }

  public String getTeacherLastName() {
    return teacherLastName;
  }

  public void setTeacherLastName(String teacherLastName) {
    this.teacherLastName = teacherLastName;
  }

  public int getTimeWithTeacher() {
    return timeWithTeacher;
  }

  public void setTimeWithTeacher(int timeWithTeacher) {
    this.timeWithTeacher = timeWithTeacher;
  }
}
