package pl.javastart.library.model;

public class Tire extends Part {
  private int width;
  private int size;

  public Tire(int size, int width) {
    this.size = size;
    this.width = width;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
