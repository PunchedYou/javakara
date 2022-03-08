package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe12 extends JavaKaraProgram {

    public void myProgram() {
        int breite = 1;
        int richtung = 0;

        for (int y = 0; y < 5; y++) {
            for (int i = 0; i < breite; i++) {
                kara.putLeaf();
                kara.move();
            }
            richtung = drehen(richtung);
            breite = breite + 2;
        }
    }

    private int drehen(int richtung) {
        if (richtung == 0) {
            kara.turnRight();
            kara.move();
            kara.turnRight();
            return 1;
        } else {
            kara.turnLeft();
            kara.move();
            kara.turnLeft();
            return 0;
        }
    }
}