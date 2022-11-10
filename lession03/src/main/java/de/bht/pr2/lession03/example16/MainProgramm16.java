package de.bht.pr2.lession03.example16;

import java.util.HashSet;
import java.util.Set;

public class MainProgramm16 {

  // equals()- und hashCode()-Methode

  public static void main(String[] args) {
    //-----------------------------
    // Schiffe erzeugen
    SchiffWithEqualsHashCode schiffA1 = new SchiffWithEqualsHashCode("A", 40, 20);
    SchiffWithEqualsHashCode schiffA2 = new SchiffWithEqualsHashCode("A", 40, 20);

    SchiffWithEqualsHashCode schiffB1 = new SchiffWithEqualsHashCode("B", 40, 20);
    SchiffWithEqualsHashCode schiffB2 = new SchiffWithEqualsHashCode("B", 40, 20);

    //-----------------------------
    // Set erzeugen
    Set<SchiffWithEqualsHashCode> setVonSchiffen = new HashSet<>();
    setVonSchiffen.add(schiffA1);
    setVonSchiffen.add(schiffA2);
    setVonSchiffen.add(schiffB1);
    setVonSchiffen.add(schiffB2);

    for (SchiffWithEqualsHashCode s : setVonSchiffen) {
      System.out.println(s);
    }
  }
}
