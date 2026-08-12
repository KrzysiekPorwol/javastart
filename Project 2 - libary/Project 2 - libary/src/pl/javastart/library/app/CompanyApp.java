package pl.javastart.library.app;

import pl.javastart.library.logic.ReadFile;
import pl.javastart.library.logic.SaveFile;
import pl.javastart.library.logic.TalkWithUser;
import pl.javastart.library.model.Company;

public class CompanyApp {

  static void main() {

    TalkWithUser talkWithUser = new TalkWithUser();
    SaveFile saveInFile = new SaveFile();
    ReadFile readFile = new ReadFile();
    Company company1 = new Company(3);

    int choice = talkWithUser.TalkWithUserChoice();

    if (choice == 2) {

      for (int i = 0; i < 3; i++) {
        company1.addEmployee(talkWithUser.TalkWithUserTakeInfo());
      }

      saveInFile.saveInFile(company1);

    }
    if (choice == 1)
      System.out.println(readFile.readFile().toString());
  }
}
