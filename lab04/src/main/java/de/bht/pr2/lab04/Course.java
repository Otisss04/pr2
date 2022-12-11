package de.bht.pr2.lab04;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Course implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  private final String name;
  private final String studyCourse;

  public Course(String name, String studyCourse) {
    this.name = name;
    this.studyCourse = studyCourse;
  }

  public String getName() {
    return name;
  }

  public String getStudyCourse() {
    return studyCourse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Course course = (Course) o;
    return Objects.equals(name, course.name) && Objects.equals(studyCourse,
        course.studyCourse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, studyCourse);
  }

  @Override
  public String toString() {
    return "Course [" +
        "name='" + name +
        ", studyCourse='" + studyCourse +
        ']';
  }
}
