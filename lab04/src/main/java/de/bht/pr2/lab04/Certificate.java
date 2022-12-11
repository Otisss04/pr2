package de.bht.pr2.lab04;

import java.io.Serial;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Certificate implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  private final Student student;
  private final List<Grade> grades;

  public Certificate(Student student) {
    this.grades = new LinkedList<>();
    this.student = student;
  }

  public void addGrade(Grade grade) {
    final Student student1 = grade.getSubscription().getStudent();
    if (!student1.equals(this.student)) {
      throw new IllegalArgumentException(student1 + " not eqal to " + student);
    }
    grades.add(grade);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Certificate that = (Certificate) o;
    return Objects.equals(student, that.student) && Objects.equals(grades,
        that.grades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(student, grades);
  }

  @Override
  public String toString() {
    return "Certificate [" +
        "student=" + student +
        ", grades=" + grades +
        ']';
  }
}
