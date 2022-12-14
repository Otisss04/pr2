package de.bht.pr2.lab03.part4;

import de.bht.pr2.lab03.Buch;
import de.bht.pr2.lab03.ParseBooks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupByBookType {

  public static void main(String[] args) {
    List<Buch> buches = ParseBooks.parseBooks();
    Set<Buch> uniqueBook = new HashSet<>(buches);
    for (Buch buch : buches) {
      String ti = buch.getTitel();
      int ed = buch.getEdition();
      String all = ti+ed;
      if (all.equalsIgnoreCase(ti) && all.equalsIgnoreCase(String.valueOf(ed))) { //ti.equals && ed.equals
        uniqueBook.add(all);
      }
      System.out.println("Buch: " +uniqueBook);
    }
    /*String uniqueBook = "";
    for (Buch buch : buches) {
      uniqueBook =  buch.getTitel() + buch.getEdition();
      if (uniqueBook.contains(uniqueBook)) System.out.println("Buch: " + uniqueBook);
      if (buch instanceof Buch) {
        Buch b = (Buch) buch;
        if (b.getEdition().)
      }*/
    }
    /* Das Ergebnis der Berechnungen sollte sein:

Bücher Anzahl: 6
	Buch: 7 Minuten am Tag (2016)
	Buch: Der Heimweg (2016)
	Buch: Ohne Schuld (2020)
	Buch: Escape Room (2020)
	Buch: Der Heimweg (2020)
	Buch: Ohne Schuld (2016)
Ebücher Anzahl: 4
	Ebuch: Ohne Schuld (2020)
	Ebuch: Der Heimweg (2020)
	Ebuch: Zwei Handvoll Leben (2020)
	Ebuch: Kingsbridge - Der Morgen einer neuen Zeit (2020)
Hörbücher Anzahl: 5
	Hörbuch: QualityLand 2.0 (2019)
	Hörbuch: Funken Mord (2018)
	Hörbuch: QualityLand 2.0 (2018)
	Hörbuch: Funken Mord (2019)
	Hörbuch: Harry Potter - alle 7 Bände (2018)
     */
  }

