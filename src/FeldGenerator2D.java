/**
 * Erstelle dein Programm über Blockly und
 * klicke auf 'Play', um es auszuführen!
 */

public class FeldGenerator2D {
    private FilledShape[][] feld;


    public void generiereFeld(int anzahlZeilen, int anzahlSpalten) {
        feld = new FilledShape[anzahlSpalten][];
        for (int k = 0; k < anzahlSpalten; k++) {
            feld[k] = spalteErzeugen(anzahlZeilen, 50 * k);
        }
    }

    public FilledShape[] spalteErzeugen(int anzahlZeilen, int x) {
        Rectangle[] reihe = new Rectangle[anzahlZeilen];
        for (int m = 0; m < anzahlZeilen; m++) {
            reihe[m] = new Rectangle(x, 50 * m, 45, 45);
            reihe[m].setFillColor("#ff9966");
            Text text = new Text(x, 50 * m, 20, x / 50+";"+m);
            text.setFillColor("#66ff99");
        }
        return reihe;
    }

    public void setzeFarbe(String farbe, int x, int y) {
        feld[x][y].setFillColor("#ff0000");
    }

}