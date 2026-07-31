package pl.javastart.library.model.Course;

public class CourseOnline extends Course {
  private int videoTime;
  private int courseTime;

  public int getVideoTime() {
    return videoTime;
  }

  public void setVideoTime(int videoTime) {
    this.videoTime = videoTime;
  }

  public int getCourseTime() {
    return courseTime;
  }

  public void setCourseTime(int courseTime) {
    this.courseTime = courseTime;
  }
}
