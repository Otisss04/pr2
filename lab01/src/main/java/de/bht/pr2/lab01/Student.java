package de.bht.pr2.lab01;

public class Student {

  //-------------------------------------------
  // Attribute
  private String name = "";

  // Matrikelnummer
  private int registrationNumber = 0;

  // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
  private String courseOfStudies = "";

  // Rückmeldegebühr
  public static final int TUITION_FEE = 312;

  /**
   * This contructor parses a comma-separated row describing a student object.
   *
   * @param dataRow a comma-separated row describing a student object
   */
  public Student(String dataRow) {
    {
      String[] dataRowArray = dataRow.split(",");
      if (dataRowArray.length != 4) {
        throw new StudentParseException("Not enough data in dataRowArray: " + dataRow + ".");
      }
      name = dataRowArray[0];
      try {
        registrationNumber = Integer.parseInt(dataRowArray[1]);
      } catch (NumberFormatException e) {
        throw new RegistrationNumberException("No valid RN data in:" + dataRow + ".");
      }
      //System.out.println(dataRowArray);
    }
  }
}
