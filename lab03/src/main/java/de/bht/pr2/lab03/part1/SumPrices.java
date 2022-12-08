package de.bht.pr2.lab03.part1;

import de.bht.pr2.lab03.Buch;
import de.bht.pr2.lab03.EBuch;
import de.bht.pr2.lab03.Hörbuch;
import de.bht.pr2.lab03.ParseBooks;

import java.util.List;

public class SumPrices {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

    Summe Buch:     € 381.88
    Summe Ebuch:    € 255.82
    Summe Hoerbuch: € 344.58
    Summe Alle:     € 982.28
   */
    List<Buch> buches = ParseBooks.parseBooks();
    double sumBuch = 0;
    double sumEbuch = 0;
    double sumHoerbuch = 0;
    double sumAll = 0;

    for (Buch buch : buches) {
      sumAll += buch.getPreis();
      if (buch instanceof EBuch) {
        sumEbuch += buch.getPreis();
      }
      if (buch instanceof Hörbuch) {
        sumHoerbuch += buch.getPreis();
      }
      if (!(buch instanceof EBuch) && !(buch instanceof Hörbuch)) {
        sumBuch += buch.getPreis();
      }
    }
    System.out.println(sumAll);
    System.out.println(sumEbuch);
    System.out.println(sumHoerbuch);
    System.out.println(sumBuch);
  }
}
