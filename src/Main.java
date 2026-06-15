/**
 * Erstelle dein Programm über Blockly und
 * klicke auf 'Play', um es auszuführen!
 */

public class Main {
    /**
     * Das Hauptprogramm (main-Methode):
     * Alles, was ausgeführt werden soll,
     * muss in diese Methode eingefügt werden.
     * Objekte erstellen, Methoden aufrufen, ...
     *
     * Das Hauptprogramm wird automatisch
     * gestartet, wenn du auf 'Play' drückst.
     */
    public static void main() {
        FeldGenerator spielfeld = new FeldGenerator();
        spielfeld.generiereFeld(10, 10);
        spielfeld.setzeFarbe("#ff0000", 2, 5);
    }



} /*// main()-Methode starten
Main.main();*/