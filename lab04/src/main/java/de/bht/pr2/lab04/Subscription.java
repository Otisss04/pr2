package de.bht.pr2.lab04;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Subscription implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;


  private final Student student;
  private final Course course;

  public Subscription(Student student, Course course) {
    this.student = student;
    this.course = course;
  }

  public Student getStudent() {
    return student;
  }

  public Course getCourse() {
    return course;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription that = (Subscription) o;
    return Objects.equals(student, that.student) && Objects.equals(course,
        that.course);
  }

  @Override
  public int hashCode() {
    return Objects.hash(student, course);
  }

  @Override
  public String toString() {
    return "Subscription [" +
        "student=" + student +
        ", course=" + course +
        ']';
  }
}
