package de.bht.pr2.lab03.part2;

import de.bht.pr2.lab03.Buch;
import de.bht.pr2.lab03.EBuch;
import de.bht.pr2.lab03.ParseBooks;

import java.util.List;

public class Tolino3BookCount {

  public static void main(String[] args) {
    List<Buch> buches = ParseBooks.parseBooks();
    String test = "";
    int i = 0;
    for (Buch eBuch : buches) {
      if (eBuch instanceof EBuch) {
        EBuch e = (EBuch) eBuch;
        e.getTolinoVersion();
        if (e.getTolinoVersion().contains("3")) {
          i++;
        }
      }
    }
    System.out.println(i);
  }
    /* Das Ergebnis der Berechnungen sollte sein:
    Anzahl Ebuecher bei Tolino 3: 9
     */
}
