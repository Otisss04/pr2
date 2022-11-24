package de.bht.pr2.lab03.part1;

import de.bht.pr2.lab03.Buch;
import de.bht.pr2.lab03.ParseBooks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumPrices {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

    Summe Buch:     € 381.88
    Summe Ebuch:    € 255.82
    Summe Hoerbuch: € 344.58
    Summe Alle:     € 982.28
   */
    List<Buch> buches = ParseBooks.parseBooks();
    double sumAll = 0;
    for (Buch buch: buches) {
      sumAll = sumAll + buch.getPreis();
    }

    System.out.println(sumAll);
  }
}
