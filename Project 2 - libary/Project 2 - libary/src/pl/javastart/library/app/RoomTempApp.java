package pl.javastart.library.app;

import pl.javastart.library.logic.RoomTemp;
import pl.javastart.library.model.Temperature;

import java.util.Scanner;

public class RoomTempApp {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Temperature temperature = new Temperature();
    RoomTemp roomTemp = new RoomTemp();

    System.out.print("Podaj temp. aktualną: ");
    temperature.setCurrentTemperature(input.nextInt());
    input.nextLine();
    System.out.print("Podaj temp. docelową: ");
    temperature.setExpectedTemperature(input.nextInt());

    roomTemp.changeTemperature(temperature);

  }
}
