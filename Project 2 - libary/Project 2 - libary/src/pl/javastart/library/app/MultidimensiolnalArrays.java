package pl.javastart.library.app;

public class MultidimensiolnalArrays {

  static void main(String[] args) {
    double array[][] = new double[3][3];
    array[0][0] = 1;
    array[0][1] = 1.5;
    array[0][2] = 2;
    array[1][0] = 1.5;
    array[1][1] = 2;
    array[1][2] = 2.5;
    array[2][0] = 2;
    array[2][1] = 2.5;
    array[2][2] = 3;

    double diagonals = array[0][0] * array[1][1] * array [2][2] + array[0][2] * array[1][1] * array[2][0];
    System.out.println("Suma iloczynów przekątnych tablicy to: " + diagonals);

    double mid = (array[1][0] + array[1][1] + array[1][2]) * (array[0][1] + array[1][1] + array[2][1]);
    System.out.println("Suma iloczynów środkowego wiersza i środkowej kolumny: " + mid);

    double edge = array[0][0] + array[0][1] + array[0][2] + array[1][0] + array[1][2]
          + array[2][0] + array[2][1] + array[2][2];
    System.out.println("Suma wszystkich elementów znajdujacych sie przy krawedzi tablicy: " + edge);
  }

}

//
//Sumę iloczynów przekątnych tablicy,
//iloczyn sum środkowego wiersza i środkowej kolumny tablicy,
//sumę wszystkich elementów znajdujących się przy krawędzi tablicy.