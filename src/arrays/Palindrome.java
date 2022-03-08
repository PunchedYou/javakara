package arrays;

import javakara.JavaKaraProgram;

public class Palindrome extends JavaKaraProgram {

    public void myProgram() {
        int x = world.getSizeX();
        int y = world.getSizeY();

        for (int i = 0; i < y; i++) {
            boolean zeile[] = new boolean[x];

            // Überprüft die Zeile
            for (int j = 0; j < x; j++) {
                if (kara.onLeaf()) {
                    zeile[j] = true;
                } else {
                    zeile[j] = false;
                }
                kara.move();
            }

            boolean palindrom = true;

            // Testet den Array auf ein Palindrom
            for (int v = 0, h = (x - 1); v < x; v++, h--) {
                if (zeile[v] != zeile[h]) {
                    palindrom = false;
                }
            }

            // Gibt eine Nachricht aus
            if (palindrom) {
                tools.showMessage("Die Zeile " + i + " ist ein Palindrom");
            } else {
                tools.showMessage("Die Zeile " + i + " ist kein Palindrom");
            }

            // Nächste Zeile
            kara.turnRight();
            kara.move();
            kara.turnLeft();
        }
    }
}