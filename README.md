## Aufgabe starten: [blockly2java.de](https://blockly2java.de)

|                                                        Token-URL kopieren                                                        |                                                    Klonen                                                     |                                                 URL einfügen                                                  |
| :------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|          ![b2j_img_1.png](https://github.com/Blockly2Java/Spielfeld/blob/main/shared_resources/b2j_img_1.png?raw=true)           | ![b2j_img_2.png](https://github.com/Blockly2Java/Spielfeld/blob/main/shared_resources/b2j_img_2.png?raw=true) | ![b2j_img_3.png](https://github.com/Blockly2Java/Spielfeld/blob/main/shared_resources/b2j_img_3.png?raw=true) |
| ![b2j_img_1b.png](https://github.com/Blockly2Java/Spielfeld/blob/main/shared_resources/b2j_img_1b.png?raw=true) *<-- nur Github* |                                                                                                               |                                                                                                               |


---


## Aufgabe: Spielfeld

Wir programmieren ein Spielfeld, das man dann z.B. zu einem Schachspiel erweitern kann. Das Spielfeld hat eine feste Größe, ist also perfekt für Arrays geeignet. Wir programmieren das auf zwei verschiedene Weisen. Als eindimensionales und zweidimensionales Array.

---

## Klassendiagramm
[//]: #[task][](structStructural[all])

![CD](http://www.plantuml.com/plantuml/proxy?cache=no&fmt=svg&src=https://raw.githubusercontent.com/Blockly2Java/Spielfeld/main/shared_resources/cd.puml)







---

## Beschreibung - Vorlage

Die Vorlage enthält bereits die Vorlagen für Methoden. An Methodenkopf und Parametern muss nichts geändert werden. Die `main()` enthält bereits die Aufrufe, um ein Spielfeld zu erzeugen und die Farbe einer Zelle zu ändern. Um den 2-dimensionalen Generator zu testen, musst du die Methode anpassen.

---

## Aufgaben

[//]: #[task][](testMain()) 
- **`generiereFeld(zeilen, spalten)`**

    * Schreibe eine Methode, die die eingegebenen Spalten- und Zeilenanzahlen in den entsprechenden Attributen speichert. 
    * Erzeuge anschließend ein Arrays mit passend viele Plätzen für alle Zellen des Spielfelds (Tipp: Zeilen x Spalten)
    * Erzeuge anschließend ein Rechteck (Größe: 45 x 45) für jede Zelle und speichere diese im Array.
    * Lasse zwischen den Rechtecken 5 Einheiten Platz.
    * Nutze Schleifen und ihre Variablen geschickt, um Positionen zu berechnen.
- **`setzeFarbe(farbe, x, y)`**: Setzt die Farbe des entsprechenden Rechtecks im Spielfeld bzw. Array. *Achutng: Hier musst du ausrechnen, welche Position im eindimensionalen Array gemeint ist. Nutze hierfür die Attribute deines Spielfelds.*
    
#### 2 dimensionales Array (Zusatzaufgabe)


Ein 2 dimensionales Array ist ein Array aus Arrays. Jede Spalte des Spielfelds entspricht einem Array aus Rechtecken. 

[//]: #[task][](testMain()) 

Programmiere die Klasse `FeldGenerator2D`. Sie erbt von `FeldGenerator` (bereits in der Vorlage) und überschreibt die Methoden `generiereFeld()` und `setzeFarbe()` so, dass sie ein zweidimensionales Array nutzen.

*Tipp: Nutze die Methode `spalteErzeugen()`, um die Spalten zu erzeugen. Das macht deine Methode einfacher.*


---