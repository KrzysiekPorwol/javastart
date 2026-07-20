package logic;


public class UpgradeNumber9999 {
  public int upgradeNumber(int randomNumber) {
    if (randomNumber > 999) {
     return randomNumber;
    } else if (randomNumber == 0) {
      return randomNumber;
    } else if (randomNumber > 99) {
      return randomNumber * 10;
    } else  if (randomNumber < 10) {
      return randomNumber * 1000;
    } else {
      return randomNumber * 100;
    }
  }
}
