package de.bht.pr2.lab03;

import de.bht.pr2.lab03.store.BookStore;

import java.util.List;

public class Buch {
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

}
