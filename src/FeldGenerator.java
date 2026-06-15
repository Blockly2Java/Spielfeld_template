/**
 * Erstelle dein Programm über Blockly und
 * klicke auf 'Play', um es auszuführen!
 */

public class FeldGenerator {
    private int anzahlZeilen;
    private int anzahlSpalten;
    private Rectangle[] feld;


    public void generiereFeld(int zeilen, int spalten) {
        anzahlZeilen = zeilen;
        anzahlSpalten = spalten;
        feld = new Rectangle[zeilen * spalten];
        for (int k = 0; k < zeilen; k++) {
            for (int j = 0; j < spalten; j++) {
                feld[k + j * anzahlSpalten] = new Rectangle(50 * j, 50 * k, 45, 45);
                Text text = new Text(50 * j, 50 * k, 20, j+";"+k);
                text.setFillColor("#66ff99");
            }
        }
    }

    public void setzeFarbe(String farbe, int x, int y) {
        feld[x + y * anzahlSpalten].setFillColor("#ff0000");
    }

}