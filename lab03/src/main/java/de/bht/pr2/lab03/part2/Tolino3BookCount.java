package de.bht.pr2.lab03.part2;

import de.bht.pr2.lab03.Buch;
import de.bht.pr2.lab03.EBuch;
import de.bht.pr2.lab03.ParseBooks;

import java.util.List;

public class Tolino3BookCount {

  public static void main(String[] args) {
    List<Buch> buches = ParseBooks.parseBooks();
    for (Buch buch:buches) {
      if (buch instanceof EBuch) { //
        EBuch e = (EBuch) buch;
        e.getEdition();//downcasting; am besten immer mit if-schleife
        if (e.getEdition() == Integer.parseInt("3")) {
          System.out.print(e);
        }
      }
    }
  }
    /* Das Ergebnis der Berechnungen sollte sein:

    Anzahl Ebuecher bei Tolino 3: 9

     */
}
