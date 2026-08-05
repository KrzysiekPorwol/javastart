package pl.javastart.library.model;

import java.util.Objects;

public class Computer2 {
  private int model;
  private String producer;

  public Computer2(int model, String producer) {
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
    Computer2 computer2 = (Computer2) o;
    return model == computer2.model && Objects.equals(producer, computer2.producer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, producer);
  }

  @Override
  public String toString() {
    return "Computer2{" +
          "model=" + model +
          ", producer='" + producer + '\'' +
          '}';
  }
}
