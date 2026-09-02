package pl.javastart.library.logic.file;

import pl.javastart.library.logic.Temperature;
import pl.javastart.library.logic.Weather;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReadWeather {

  public List<Weather> readWeather() {
    String fileName = "/Users/krzysztofporwol/javastart/weather.csv";
    List<Weather> allWeathers = new ArrayList<>();
    String line = null;
    try (
          var fr = new FileReader(fileName);
          var bf = new BufferedReader(fr);
    ) {
      while ((line = bf.readLine()) != null) {
        String[] fields = line.split(";");
        String[] date = fields[0].split("-");
        LocalDate localDate = LocalDate.of(
              Integer.parseInt(date[0]),
              Integer.parseInt(date[1]),
              Integer.parseInt(date[2]));
        double minTemp = Double.parseDouble(fields[1]);
        double maxTemp = Double.parseDouble(fields[2]);
        Temperature temperature = Temperature.valueOf(fields[3]);

        allWeathers.add(new Weather(localDate, minTemp, maxTemp, temperature));

      }

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (Exception e) {
      throw new RuntimeException("Nieprawidłowe dane w wierszu: " + line, e);
    }
    return allWeathers;
  }


}
