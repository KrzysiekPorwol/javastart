package pl.javastart.library.app;

import pl.javastart.library.model.ExhaustPart;
import pl.javastart.library.model.Part;
import pl.javastart.library.model.Tire;

public class PartApp {
  static void main() {
    ExhaustPart exhaustPart1 = new ExhaustPart();

    exhaustPart1.setModel("Ale");
    exhaustPart1.setCompliantWithEmissionStandards(true);

    Part part1 = new Part();

    part1.setModel("Vacum");
    part1.setIdNumber(1);

    Tire tire1 = new Tire(200,150);

    tire1.setSeries(5);

    System.out.print(tire1.getSize() + " " + tire1.getWidth() + " " + tire1.getSeries() + " " + tire1.getIdNumber() + " " + tire1.getProducer());
  }
}
