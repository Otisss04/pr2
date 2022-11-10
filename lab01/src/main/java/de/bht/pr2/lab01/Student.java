package de.bht.pr2.lab01;

import java.lang.invoke.WrongMethodTypeException;

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

  /*/**
   * This contructor parses a comma-separated row describing a student object.
   *
   * @param dataRow a comma-separated row describing a student object
   */
  public Student(String data)
          throws StudentParseException, RegistrationNumberException, WrongCourseOfStudiesException, NotPaidTuitionFeeException {

    String[] parts = data.split(",");

    if (parts.length != 4) {
      throw new StudentParseException("Not enough parts in data: '" + data + "'.");
    }

    name = parts[0];

    try {
      registrationNumber = Integer.parseInt(parts[1]);
    } catch (NumberFormatException e) {
      throw new RegistrationNumberException(
              "Not a valid registration number in data: '" + data + "'.");
    }

    courseOfStudies = parts[2];

    if (!courseOfStudies.equalsIgnoreCase("Medieninformatik") &&
            !courseOfStudies.equalsIgnoreCase("Technische Informatik") &&
            !courseOfStudies.equalsIgnoreCase("Druck- und Medientechnik") &&
            !courseOfStudies.equalsIgnoreCase("Screen Based Media")) {
      throw new WrongCourseOfStudiesException(
              "Course of studies \"" + courseOfStudies + "\" does not belong to Fachbereich VI.");
    }

    int tuitionPaid = -1;
    try {
      tuitionPaid = Integer.parseInt(parts[3]);
    } catch (NumberFormatException e) {
      throw new StudentParseException("Wrong tuition paid in data: '" + data + "'.");
    }

    int toBePaid = TUITION_FEE - tuitionPaid;
    if (toBePaid > 0) {
      throw new NotPaidTuitionFeeException(
              "Student still has to pay " + toBePaid + " € tuition fee.");
    }
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRegistrationNumber() {
    return registrationNumber;
  }

  public void setRegistrationNumber(int registrationNumber) {
    this.registrationNumber = registrationNumber;
  }

  public String getCourseOfStudies() {
    return courseOfStudies;
  }

  public void setCourseOfStudies(String courseOfStudies) {
    this.courseOfStudies = courseOfStudies;
  }
}
