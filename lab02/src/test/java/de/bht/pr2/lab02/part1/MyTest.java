package de.bht.pr2.lab02.part1;

import de.bht.pr2.lab02.part2.BubbleSort;
import de.bht.pr2.lab02.part2.InsertionSort;
import de.bht.pr2.lab02.part2.QuickSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MyTest {

  @Test
  void shouldBeAbleToKnowExactTuitionFee() {
    assertThrows(NotPaidTuitionFeeException.class, () -> {
      Student student = new Student("Rafael Raum,70018,Druck- und Medientechnik,311");
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
      Student student = new Student("Bob Meier,30004,Medieninformatik,312.11");
    });
  }
  //Generating int array with shuffle method
  private static Random random = null;
  public static void shuffle(int [] a) {
    if(random==null) {
      random = new Random ( ) ;
    }
    for(int i=a.length-1; i>0; i--) {
      swap(a, i , random.nextInt(i+1));
    }
  }
  public static void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }
  int[] a = new int[10];
  @BeforeEach
  void foo() {
    for(int i = 0; i<a.length; i++) {
      a[i] = i;
    }
    System.out.println(Arrays.toString(a));
    shuffle(a);
    System.out.println(Arrays.toString(a));
  }
  @Test
  void shouldTestBubbleSortForCorrectness() {
    BubbleSort.sort(a);
    System.out.println(Arrays.toString(a));
    assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, a);
  }
  @Test
  void  shouldTestInsertionSortForCorrectness() {
    InsertionSort.sort(a);
    System.out.println(Arrays.toString(a));
    assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, a);
  }
  @Test
  void shouldTestQuickSortForCorrectness(){
    QuickSort.sort(a);
    System.out.println(Arrays.toString(a));
    assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, a);
  }
}
