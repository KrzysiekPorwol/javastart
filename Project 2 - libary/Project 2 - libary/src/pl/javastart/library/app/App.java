package pl.javastart.library.app;

import pl.javastart.library.logic.Temperature;
import pl.javastart.library.logic.Weather;
import pl.javastart.library.logic.file.ReadWeather;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {

  static void main() {
    Scanner input = new Scanner(System.in);
    ReadWeather readWeather = new ReadWeather();

    List<Weather> weathers = readWeather.readWeather();

    System.out.println("Dane z którego dnia Cię interesują? (format yyyy-MM-dd)");

    String[] weatherData1 = input.nextLine().split("-");
    LocalDate weatherDate = LocalDate.of(
          Integer.parseInt(weatherData1[0]),
          Integer.parseInt(weatherData1[1]),
          Integer.parseInt(weatherData1[2]));

    System.out.println("W jakiej jednostce wyświetlić pomiary? F / C?");
    String choice = input.nextLine();
    if (choice.equals("C")) {
      weathers.stream()
            .filter(weather -> weather.localDate().equals(weatherDate))
            .map(Weather::convertFromFtoC)
            .forEach(weather -> System.out.println(weather.toString()));
    } else if (choice.equals("F")) {
      weathers.stream()
            .filter(weather -> weather.localDate().equals(weatherDate))
            .map(Weather::convertFromCtoF)
            .forEach(weather -> System.out.println(weather.toString()));

    }
  }
//     (°C * 1.8) + 32


}
