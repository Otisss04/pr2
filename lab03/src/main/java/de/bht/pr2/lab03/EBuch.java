package de.bht.pr2.lab03;

public class EBuch extends Buch{
    private String tolinoVersion;

    public EBuch(String titel, double preis, int edition, String tolinoVersion) {
        super(titel, preis, edition);
        this.tolinoVersion = tolinoVersion;
    }
    @Override
    public String toString() {
        return "EBuch{" +
                "tolinoVersion='" + tolinoVersion + '\'' +
                ", titel='" + titel + '\'' +
                ", preis=" + preis +
                ", edition=" + edition +
                '}';
    }
}
