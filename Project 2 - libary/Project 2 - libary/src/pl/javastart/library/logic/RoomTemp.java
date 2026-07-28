package pl.javastart.library.logic;

import pl.javastart.library.model.Temperature;

public class RoomTemp {

  public void changeTemperature(Temperature temperature) {


    if (temperature.getCurrentTemperature() <= temperature.getExpectedTemperature()) {
      for (temperature.getCurrentTemperature(); temperature.getCurrentTemperature() < temperature.getExpectedTemperature();
           temperature.setCurrentTemperature(temperature.getCurrentTemperature())) {
        temperature.setCurrentTemperature(temperature.getCurrentTemperature() + 0.5);
        System.out.println("Aktualna temperatura to: " + temperature.getCurrentTemperature());
      }
      System.out.println("Osiągnieto temp. docelową " + temperature.getCurrentTemperature());

    } else if (temperature.getCurrentTemperature() >= temperature.getExpectedTemperature()) {
      for (temperature.getCurrentTemperature(); temperature.getCurrentTemperature() > temperature.getExpectedTemperature();
           temperature.setCurrentTemperature(temperature.getCurrentTemperature())) {
        temperature.setCurrentTemperature(temperature.getCurrentTemperature() - 0.5);
        System.out.println("Aktualna temperatura to: " + temperature.getCurrentTemperature());
      }
      System.out.println("Osiągnieto temp. docelową " + temperature.getCurrentTemperature());
    }
  }
}
