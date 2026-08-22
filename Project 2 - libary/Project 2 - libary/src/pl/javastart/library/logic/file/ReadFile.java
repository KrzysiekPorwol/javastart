package pl.javastart.library.logic.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class ReadFile {

  public TreeSet<String> readFile() {
    TreeSet<String> firstNames = new TreeSet<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.compareTo(o1);
      }
    });
    String filename = "/Users/krzysztofporwol/javastart/namespl.txt";

    try (
          FileReader fr = new FileReader(filename);
          BufferedReader br = new BufferedReader(fr);
    ) {
      String line;
      while ((line = br.readLine()) != null) {
        firstNames.add(line);
      }

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return firstNames;
  }
}
