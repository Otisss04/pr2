package de.bht.pr2.lab04;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;


  //-------------------------------------------
  // Attribute
  private String name = "";
  private int registrationNumber = 0;

  //-------------------------------------------
  // Konstruktor
  public Student(String name, int registrationNumber) {
    this.name = name;
    this.registrationNumber = registrationNumber;
  }

  //-------------------------------------------
  // Methoden

  public String getName() {
    return name;
  }

  public int getRegistrationNumber() {
    return registrationNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return registrationNumber == student.registrationNumber && Objects.equals(name,
        student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, registrationNumber);
  }

  @Override
  public String toString() {
    return "Student [" +
        "name='" + name +
        ", registrationNumber=" + registrationNumber +
        ']';
  }
}
