package de.bht.pr2.lab03.part4;

import de.bht.pr2.lab03.Buch;
import de.bht.pr2.lab03.EBuch;
import de.bht.pr2.lab03.Hörbuch;
import de.bht.pr2.lab03.ParseBooks;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByBookType {

  public static void main(String[] args) {
    List<Buch> groupList = ParseBooks.parseBooks();

    Set<Buch> bookSet = new HashSet<>();
    Set<EBuch> ebookSet = new HashSet<>();
    Set<Hörbuch> audioBookSet = new HashSet<>();

    System.out.println("-----------");
    Collections.sort(groupList);

    for (Buch x :groupList) {
      if (x instanceof EBuch ) {
        ebookSet.add((EBuch) x);
      } else if (x instanceof Hörbuch) {
        audioBookSet.add((Hörbuch) x );
      } else{
        bookSet.add(x);
      }
    }

    for(EBuch x : ebookSet){
      System.out.println("Ebuch : " + x.getTitel() + " " + x.getEdition());
    }
    for(Hörbuch x : audioBookSet){
      System.out.println("AudioBook : " + x.getTitel() + " " + x.getEdition());
    }
    for(Buch x : bookSet){
      System.out.println("Buch : " + x.getTitel() +  " " + x.getEdition());
    }

    /*List<Buch> buches = ParseBooks.parseBooks();

    Set<Buch> uniqueBook = new HashSet<>();
    Set<EBuch> uniqueEbook = new HashSet<>();
    Set<Hörbuch> uniqueHörbuch = new HashSet<>();

    Collections.sort(buches);

    for (Buch x : buches) {
      if (x instanceof EBuch) {
        uniqueEbook.add((EBuch) x);
      } else if (x instanceof Hörbuch) {
        uniqueHörbuch.add((Hörbuch) x);
      } else {
        uniqueBook.add(x);
      }
    }

    for(Buch x : uniqueBook){
      System.out.println("Buch : " + x.getTitel() +  " " + x.getEdition());
    }
    for (EBuch x : uniqueEbook) {
      System.out.println("Ebuch: " + x.getTitel() + " " + x.getEdition());
    }
    for (Hörbuch x : uniqueHörbuch) {
      System.out.println("Hörbuch: " +x.getTitel() + " " + x.getEdition());
    }*/


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
}

