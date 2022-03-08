package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe14 extends JavaKaraProgram {

    boolean zellen[][];
    boolean neueZellen[][];

    public void myProgram() {
        int b = world.getSizeX();
        int h = world.getSizeY(); // gibt die Größe der Welt zurück
        zellen = new boolean[b][h];
        neueZellen = new boolean[b][h]; // Koordinaten System mit Blatt ?= true/false
        int x;
        int y;
        boolean p = true; // solange true läuft das Programm

        for (y = 1; y < h - 1; y++) {
            for (x = 1; x < b - 1; x++) {
                zellen[x][y] = world.isLeaf(x, y); // isLeaf = prüft auf Blatt
            }
        }

        do {
            p = false;
            for (y = 1; y < h - 1; y++) {
                for (x = 1; x < b - 1; x++) {
                    neueZellen[x][y] = pruefeNachbarn(x, y);
                }
            }

            for (y = 1; y < h - 1; y++) {
                for (x = 1; x < b - 1; x++) {
                    zellen[x][y] = neueZellen[x][y];
                    world.setLeaf(x, y, zellen[x][y]); // setzt ein Blatt in die Welt
                }
            }

            tools.checkState(); // für den Geschwindigkeitsregler

            for (y = 1; y < h - 1; y++) {
                for (x = 1; x < b - 1; x++) {
                    if (!(world.isEmpty(x, y))) {
                        p = true;
                    }
                }
            }
        } while (p);
    }

    boolean pruefeNachbarn(int x, int y) {
        // n = Nachbarzellen
        // Bei mehr als 3 Nachbarn stirbt die Zelle
        int n = zaehleNachbarn(x, y);
        if (zellen[x][y]) {
            n = n - 1;
            return (n == 2) || (n == 3);
        } else {
            return (n == 3);
        }
    }

    int zaehleNachbarn(int x, int y) {
        // {x-1|y-1} oben links - {x+1|y+1} unten rechts
        int count = 0;
        for (int i = y - 1; i <= y + 1; i++) {
            for (int j = x - 1; j <= x + 1; j++) {
                if (zellen[j][i]) {
                    count++;
                }
            }
        }
        return count;
    }
}

// Zelle 5 wird überprüft

/*
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */