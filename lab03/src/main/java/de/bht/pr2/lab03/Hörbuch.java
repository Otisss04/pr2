package de.bht.pr2.lab03;

public class Hörbuch extends Buch{
    private String abspielmodus;

    public Hörbuch(String titel, double preis, int edition, String abspielmodus) {
        super(titel, preis, edition);
        this.abspielmodus = abspielmodus;
    }

    public String getAbspielmodus() {
        return abspielmodus;
    }

    @Override
    public String toString() {
        return "Hörbuch{" +
                "abspielmodus='" + abspielmodus + '\'' +
                ", titel='" + titel + '\'' +
                ", preis=" + preis +
                ", edition=" + edition +
                '}';
    }
}
