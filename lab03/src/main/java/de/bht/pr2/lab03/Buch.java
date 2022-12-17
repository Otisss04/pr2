package de.bht.pr2.lab03;

import de.bht.pr2.lab03.store.BookStore;

import java.util.List;
import java.util.Objects;

public class Buch implements Comparable<Buch>{
    protected String titel;
    protected double preis;
    protected int edition; //Auflage

    public Buch(String titel, double preis, int edition) {
        this.titel = titel;
        this.preis = preis;
        this.edition = edition;
    }
    public String getTitel() {
        return titel;
    }

    public double getPreis() {
        return preis;
    }

    public int getEdition() {
        return edition;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", preis=" + preis +
                ", edition=" + edition +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buch book = (Buch) o;
        return edition == book.edition && Objects.equals(titel, book.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, edition);
    }


    @Override
    public int compareTo(Buch o) {
        final int i = this.getTitel().compareTo(o.getTitel());
        if (i != 0) return i;
        final int j = Integer.compare(this.getEdition(), o.getEdition());
        if (j != 0) return j;
        else return 0;
    }
}
