public class Person {
  String firstName;
  String lastName;
  String pesel;
  ResidentialAddress residentialAddress;
  RegisteredAddress registeredAddress;
}

class ResidentialAddress {
  String street;
  int houseNumber;
  int apartmentNumber;
  String town;
  int zipCode;
}

class RegisteredAddress {
  String street;
  int houseNumber;
  int apartmentNumber;
  String town;
  int zipCode;
}