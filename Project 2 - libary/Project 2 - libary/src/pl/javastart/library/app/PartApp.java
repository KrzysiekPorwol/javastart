package pl.javastart.library.app;

import pl.javastart.library.model.ExhaustPart;
import pl.javastart.library.model.Part;
import pl.javastart.library.model.Tire;

public class PartApp {
  static void main() {
    ExhaustPart exhaustPart1 = new ExhaustPart();

    exhaustPart1.idNumber = 1;
    exhaustPart1.compliantWithEmissionStandards = true;
    exhaustPart1.series = 1;
    exhaustPart1.model = "DBKILLER";
    exhaustPart1.producer = "Jo";

    Part part1 = new Part();
    part1.idNumber = 1;

    Tire tire1 = new Tire();

    tire1.width = 100;
    tire1.size = 16;

    System.out.print(exhaustPart1.model + " " + part1.idNumber + " " + tire1.size);
  }
}
