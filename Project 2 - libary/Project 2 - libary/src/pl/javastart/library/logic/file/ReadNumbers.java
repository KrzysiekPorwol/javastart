package pl.javastart.library.logic.file;

import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class ReadNumbers {

  public int numbers() throws IOException {
    String fileName = "/Users/krzysztofporwol/javastart/numbers.txt";
    int sum = 0;
    try (
          var fileReader = new FileReader(fileName);
          var reader = new BufferedReader(fileReader);
    ) {
      String nextLine = null;
      while ((nextLine = reader.readLine()) != null) {
        if (nextLine.length() < 6) {
          sum = sum + Integer.parseInt(nextLine);
        }
      }
    } catch (IOException e) {
      System.out.println("Jakis błąd");

    }
    return sum;
  }

  public BigDecimal bigNumbers() throws IOException {
    String fileName = "/Users/krzysztofporwol/javastart/numbers.txt";
    BigDecimal big1 = BigDecimal.valueOf(0);
    int sum = 0;
    int lines = 0;
    try (
          var fileReader = new FileReader(fileName);
          var reader = new BufferedReader(fileReader);
    ) {
      String nextLine = null;
      while ((nextLine = reader.readLine()) != null) {
        if (lines >= 3) {
          BigDecimal big2 = new BigDecimal(nextLine);
          big1 = big1.add(big2);
        }
        lines++;
      }
    } catch (IOException e) {
      System.out.println("Jakis błąd");

    }
    return big1;
  }
}
//  class FileTesterTry {
//    public static void main(String[] args) {
//      String fileName = "testFile.txt";
//
//      try (
//            var fileReader = new FileReader(fileName);
//            var reader = new BufferedReader(fileReader);
//      ) {
//        String nextLine = null;
//        int lines = 0;
//        while ((nextLine = reader.readLine()) != null) {
//          System.out.println(nextLine);
//          lines++;
//        }
//        System.out.println("Ilość wierszy w pliku: " + lines);
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//    }
//  }


//public Company readFile() {
//  String fileName = "companyFile.txt";
//  Company company = null;
//  try (
//        var fs = new FileInputStream(fileName);
//        var is = new ObjectInputStream(fs);
//  ) {
//    company = (Company) is.readObject();
//    System.out.println("Wczytano dane firmy z pliku!");
//  } catch (IOException e) {
//    System.err.println("Błąd odczytu pliku " + fileName);
//    e.printStackTrace();
//  } catch (ClassNotFoundException e) {
//    System.err.println("Nie znaleziono klasy do odczytu");
//    e.printStackTrace();
//  }
//  return company;
//}