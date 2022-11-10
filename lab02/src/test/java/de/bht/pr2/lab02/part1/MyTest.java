package de.bht.pr2.lab02.part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTest {

  @Test
  void shouldBeAbleToKnowExactTuitionFee() {
    assertThrows(NotPaidTuitionFeeException.class, () -> {
      Student student = new Student("Rafael Raum,70018,Druck- und Medientechnik,200");
    });
  }

  @Test
  void shouldBeAbleToParseStudent() throws NotPaidTuitionFeeException, RegistrationNumberException, WrongCourseOfStudiesException, StudentParseException {

    Student student = new Student("Rafael Raum,70018,Druck- und Medientechnik,312");
    assertEquals("Rafael Raum", student.getName());
    assertEquals(70018, student.getRegistrationNumber());
    assertEquals("Druck- und Medientechnik", student.getCourseOfStudies());
    assertEquals(312, student.TUITION_FEE);
    //mach mal assertAll()
  }
  @Test
  void shouldBeAbleToCheckRegistrationNumber() {
    assertThrows(RegistrationNumberException.class, () -> {
      Student student = new Student("Greta Graf,7-00-06,Medieninformatik,312");
    });
  }
  @Test
  void shouldBeAbleToKnowExactCentsToBePaidFromTuitionFee() {
    assertThrows(NotPaidTuitionFeeException.class, () -> {
      Student student = new Student("Bob Meier,30004,Medieninformatik,312.00");
    });


  }

}
