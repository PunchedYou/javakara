package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe11 extends JavaKaraProgram {

    public void myProgram() {
        int x = 1;

        while (x < 20) {
            for (int i = 0; i < x; i++) {
                kara.putLeaf();
                kara.move();
            }
            kara.turnRight();
            x++;
        }
    }
}