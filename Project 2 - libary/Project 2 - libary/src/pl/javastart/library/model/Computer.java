package pl.javastart.library.model;

import java.util.Objects;

public class Computer {
  private int model;
  private String producer;

  public Computer(int model, String producer) {
    this.model = model;
    this.producer = producer;
  }

  public int getModel() {
    return model;
  }

  public void setModel(int model) {
    this.model = model;
  }

  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Computer computer = (Computer) o;
    return model == computer.model && Objects.equals(producer, computer.producer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, producer);
  }

  @Override
  public String toString() {
    return "Computer{" +
          "model=" + model +
          ", producer='" + producer + '\'' +
          '}';
  }
}
