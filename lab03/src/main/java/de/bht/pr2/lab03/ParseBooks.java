package de.bht.pr2.lab03;
import de.bht.pr2.lab03.store.BookStore;

import java.util.ArrayList;
import java.util.List;
public class ParseBooks {
    public static List<Buch> parseBooks() {
        List<String> soldBooksData = BookStore.getSoldBooks();
        List<Buch> bookList = new ArrayList<>();

        for (String datenZeile : soldBooksData) {
            String[] typeBook = datenZeile.split(";");

            String titel = typeBook[0];
            String typ = typeBook[1];
            Double preis = Double.valueOf(typeBook[2]);
            Integer edition = Integer.valueOf(typeBook[3]);

            if (typ.equalsIgnoreCase("Buch")) {
                Buch a = new Buch(titel, preis, edition);
                bookList.add(a);
            }
            if (typ.equalsIgnoreCase("Ebuch")) {
                String tolinoVersion = typeBook[4];
                Buch b = new EBuch(titel, preis, edition, tolinoVersion);
                bookList.add(b);
            }
            if (typ.equalsIgnoreCase("Hoerbuch")) {
                String abspielmodus = typeBook[4];
                Buch c = new Hörbuch(titel, preis, edition, abspielmodus);
                bookList.add(c);
            }
        }
        //System.out.println(bookList);
        return bookList;
    }
}
