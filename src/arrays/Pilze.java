package arrays;

import javakara.JavaKaraProgram;

public class Pilze extends JavaKaraProgram {

    public void myProgram() {
        int x = world.getSizeX();
        int y = world.getSizeY();

        // Wird so oft wiederholt, wie es Zeilen gibt
        for (int i = 0; i < y; i++) {
            boolean zeile[] = new boolean[x];
            boolean check = true;
            int pos = 1;
            int laenge = 1;

            // Überprüft die Felder
            for (int j = 0; true; j++) {
                if (kara.onLeaf()) {
                    zeile[j] = true;
                } else {
                    zeile[j] = false;
                }
                if (kara.mushroomFront()) {
                    // Speichert aktuelle Position und die L�nge des Weges bis zum Pilz
                    pos += j;
                    laenge += j;
                    break;
                } else if (j + 1 == x / 2) {
                    pos += j;
                    laenge = 0;
                    check = false;
                    tools.showMessage("ERROR: Zeile " + i + " ist leer oder der Pilz liegt zu weit rechts.");
                    break;
                }
                kara.move();
            }

            // Geht bis zum Start des zu überprüfendem Musters
            kara.move();
            kara.move();
            pos += 2;

            // Überprüft ob das Muster gleich ist
            for (int j = 0; j < laenge; j++, pos++) {
                if (kara.onLeaf() != zeile[j]) {
                    check = false;
                }
                kara.move();
            }

            // Geht wieder zum Anfang
            for (int j = pos; j <= x; j++) {
                kara.move();
            }

            // Gibt eine Nachricht aus
            if (check) {
                tools.showMessage("Die Muster in Zeile " + i + " sind identisch!\n �berpr�fte Musterl�nge: " + laenge);
            } else {
                tools.showMessage(
                        "Die Muster in Zeile " + i + " sind nicht identisch!\n �berpr�fte Musterl�nge: " + laenge);
            }

            // Geht zur nächsten Zeile
            kara.turnRight();
            kara.move();
            kara.turnLeft();
        }
    }
}