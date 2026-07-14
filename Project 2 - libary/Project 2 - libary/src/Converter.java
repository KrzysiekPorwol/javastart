public class Converter {
 public static void main(String[] args) {

    UnitConversion unitConversion = new UnitConversion();
    double meters = 15.5;
    double centimeters = 60;
    double millimeters = 150;

    System.out.println(unitConversion.metersToCentimeters(meters));
    System.out.println(unitConversion.metersToMillimeters(meters));
    System.out.println(unitConversion.centimetersToMeters(centimeters));
    System.out.println(unitConversion.millimetersToMeters(millimeters));

    TimeConversion timeConversion = new TimeConversion();
    int seconds = 60;
    int minutes = 60;
    int hours = 14;

    int hoursToMinutes = timeConversion.hoursToMinutes(hours);
    int minutesToSeconds = timeConversion.minutesToSeconds(hoursToMinutes);
    int secondsToMilliseconds = timeConversion.secondsToMilliseconds(minutesToSeconds);

    System.out.println(timeConversion.hoursToMinutes(hours));
    System.out.println(timeConversion.minutesToSeconds(minutes));
    System.out.println(timeConversion.secondsToMilliseconds(seconds));

    System.out.println("14 godzin na milisekundy: " + secondsToMilliseconds);

  }
}
