package pl.javastart.library.logic.file;

import pl.javastart.library.model.House;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

  public House[] readFile() {

    String sciezka = "/Users/krzysztofporwol/javastart/miasta.txt";
    House[] houses = new House[10];
    int count = 0;

    try (
          FileReader file = new FileReader(sciezka);
          BufferedReader reader = new BufferedReader(file)
    ) {
      String linia;
      boolean firstLine = true;
      while ((linia = reader.readLine()) != null) {
        if (firstLine) {
          firstLine = false;
          continue;
        }

        if (count >= 10) {
          break;
        }

        String[] split = linia.split(";");
        String city = split[0];
        int price = Integer.parseInt(split[1]);
        int area = Integer.parseInt(split[2]);

        houses[count] = new House(city, price, area);
        count++;
        System.out.println(linia);
      }
    } catch (IOException e) {
      System.out.println("Błąd podczas czytania pliku: " + e.getMessage());
    }

    return houses;
  }
}