package pl.javastart.library.logic;

import pl.javastart.library.model.AllClients;
import pl.javastart.library.model.Client;
import pl.javastart.library.model.Company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClientReadFile {

  public AllClients readFile() {
    String fileName = "/Users/krzysztofporwol/javastart/clients.csv";
    int howManyLines = readFileLinesInfo(fileName);
    AllClients clients = new AllClients(howManyLines);
    int loop = 0;

    try (
          var fileReader = new FileReader(fileName);
          var bufferedReader = new BufferedReader(fileReader);
    ) {
      String line;
      bufferedReader.readLine();
      while ((line = bufferedReader.readLine()) != null) {
        String[] field = line.split(",");
        clients.addClient(new Client(Integer.parseInt(field[0]), field[1], field[2], field[3], Double.parseDouble(field[4])));
        loop++;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return clients;
  }

  private int readFileLinesInfo(String filename) {
    int count = 0;
    try (
          var fileReader = new FileReader(filename);
          var bufferedReader = new BufferedReader(fileReader);
    ) {
      bufferedReader.readLine(); // pomijamy nagłówek
      while (bufferedReader.readLine() != null) {
        count++;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return count;
  }
}


//public class CsvReader {
//  public static void main(String[] args) {
//    String fileName = "dane.csv";
//
//    try (var br = new BufferedReader(new FileReader(fileName))) {
//      String line;
//      while ((line = br.readLine()) != null) {
//        String[] values = line.split(",");
//        System.out.println(values[0] + " -> " + values[1]);
//      }
//    } catch (IOException e) {
//      System.err.println("Nie udało się odczytać pliku");
//      e.printStackTrace();
//    }
//  }
//}

//class FileTesterTry {
//  public static void main(String[] args) {
//    String fileName = "testFile.txt";
//
//    try (
//          var fileReader = new FileReader(fileName);
//          var reader = new BufferedReader(fileReader);
//    ) {
//      String nextLine = null;
//      int lines = 0;
//      while ((nextLine = reader.readLine()) != null) {
//        System.out.println(nextLine);
//        lines++;
//      }
//      System.out.println("Ilość wierszy w pliku: " + lines);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//  }
//}