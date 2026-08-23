package pl.javastart.library.logic.file;

import pl.javastart.library.model.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadFile {

  Map<String, TreeSet<Product>> mapa = new HashMap<>();

  public Map<String, TreeSet<Product>> readFile() {
    String filename = "/Users/krzysztofporwol/javastart/map2.txt";

    try (
          FileReader fr = new FileReader(filename);
          BufferedReader bf = new BufferedReader(fr);
    ) {
      String lines;
      bf.readLine();
      while ((lines = bf.readLine()) != null) {
        String[] values = lines.split(";");
        String category = values[0];
        String name = values[1];
        int price = Integer.parseInt(values[2]);

        Product product = new Product(category, name, price);

        if (!mapa.containsKey(category)) {
          mapa.put(category, new TreeSet<Product>());
        }
        mapa.get(category).add(product);
      }

      return mapa;
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
