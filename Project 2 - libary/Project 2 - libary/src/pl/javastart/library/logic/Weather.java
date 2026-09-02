package pl.javastart.library.logic;

import java.time.LocalDate;
import java.util.stream.Stream;

public record Weather(
      LocalDate localDate,
      double minTemp,
      double maxTemp,
      Temperature temperature
) {


  public Weather convertFromFtoC () {
    double minTemp2;
    double maxTemp2;
    if (temperature == Temperature.FAHRENHEIT) {
      minTemp2 = (minTemp - 32) / 1.8;
      maxTemp2 = (maxTemp - 32) / 1.8;

      return new Weather(localDate, minTemp2, maxTemp2, Temperature.CELSIUS);
    } else
      return new Weather(localDate, minTemp, maxTemp, temperature);
  }

  public Weather convertFromCtoF () {
    double minTemp2;
    double maxTemp2;
    if (temperature == Temperature.CELSIUS) {
      minTemp2 = (minTemp * 1.8) + 32;
      maxTemp2 = (maxTemp * 1.8) + 32;

      return new Weather(localDate, minTemp2, maxTemp2, Temperature.FAHRENHEIT);
    } else
      return new Weather(localDate, minTemp, maxTemp, temperature);
  }

//  public double convertMaxTemp () {
//    if (temperature == Temperature.FAHRENHEIT) {
//      return (maxTemp * 1.8) + 32;
//    } else
//      return maxTemp;
//  }
}
