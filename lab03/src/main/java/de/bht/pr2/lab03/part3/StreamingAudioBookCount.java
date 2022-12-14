package de.bht.pr2.lab03.part3;

import de.bht.pr2.lab03.Buch;
import de.bht.pr2.lab03.Hörbuch;
import de.bht.pr2.lab03.ParseBooks;

import java.util.List;

public class StreamingAudioBookCount {

  public static void main(String[] args) {
    List<Buch> buches = ParseBooks.parseBooks();
    int i = 0;
    for (Buch hörBuch : buches) {
      if (hörBuch instanceof Hörbuch) {
        Hörbuch h = (Hörbuch) hörBuch;
        if (h.getAbspielmodus().contains("Streaming")){
          i++;
        }
      }
    }
    System.out.println(i);
    /* Das Ergebnis der Berechnungen sollte sein:

    Anzahl Hoerbuecher per Streaming: 5

     */
  }
}
