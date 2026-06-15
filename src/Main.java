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
        spielfeld.setzeFarbe("#ff0000", 9, 9);
        FeldGenerator2D spielfeld2d = new FeldGenerator2D();
        spielfeld2d.generiereFeld(5, 10);
        int x = 8;
        int y = 2;
        spielfeld2d.setzeFarbe("#33ff33", x, y);
    }



} /*// main()-Methode starten
Main.main();*/