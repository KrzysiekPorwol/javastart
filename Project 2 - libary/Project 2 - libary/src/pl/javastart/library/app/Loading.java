package pl.javastart.library.app;

public class Loading {

  static void main() {
    double timer = 0;
    String emptyLoadingBar = "";
    StringBuilder loadingBarEdit = new StringBuilder(emptyLoadingBar);
    String loadingBar = "";
    for (double i = 0; i < 100; i = i + 0.5) {

      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      if (timer == 10 || timer == 20 || timer == 30 ||
            timer == 40 || timer == 50 || timer == 60 || timer == 70 ||
            timer == 80 || timer == 90 || timer == 100) {

        loadingBarEdit .append("#");
        loadingBar = loadingBarEdit.toString();
      }
      timer = timer + 0.5;
      if (timer % 1 == 0) {
        System.out.println("/ " + timer + "% (" + loadingBar + ")");
        } else {
          System.out.println("\\ " + timer + "% (" + loadingBar + ")");
        }


//      System.out.print("/\r");
//      System.out.print("xyz");
      }
    }
  }
