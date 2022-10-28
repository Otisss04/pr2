package de.bht.pr2.lession01.beispiel;

public class Beispiel6 {

  // Wichtige Methoden:
  // getMessage()
  // toString()
  // printStackTrace()

  public static int divisionBerechnen(int zaehler) {
    int nenner = ((7 * 21) - 56) % 13; // Am Ende erreichen wir Null
    int returnInt = zaehler / nenner;
    return returnInt;
  }

  public static void main(String[] args) {
    double division = 0d; // Schon Platz reservieren

    try {
      divisionBerechnen(100);
    } catch (ArithmeticException e) {
      System.out.println("----- getMessage() -----");
      System.out.println(e.getMessage());
      System.out.println();

      System.out.println("----- toString() -----");
      System.out.println(e); // toString()-Methode aufgerufen; standardmäßig toString() bei println
      System.out.println();

      System.out.println("----- printStackTrace() -----");
      e.printStackTrace();
      System.out.println();

      System.out.println("----- printStackTrace(System.out) -----");
      e.printStackTrace(System.out);
      System.out.println();
    }

    System.out.println("-----");
    System.out.println("Ergebnis: " + division);
  }
}
