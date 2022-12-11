package de.bht.pr2.lab04;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Grade implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;

  private final Subscription subscription;
  private final Double grade;

  public Grade(Subscription subscription, Double grade) {
    this.subscription = subscription;
    this.grade = grade;
  }

  public Subscription getSubscription() {
    return subscription;
  }

  public Double getGrade() {
    return grade;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grade grade1 = (Grade) o;
    return Objects.equals(subscription, grade1.subscription) && Objects.equals(
        grade, grade1.grade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscription, grade);
  }

  @Override
  public String toString() {
    return "Grade [" +
        "subscription=" + subscription +
        ", grade=" + grade +
        ']';
  }
}
