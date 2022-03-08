package bilder;

import javakara.JavaKaraProgram;

public class Bild2 extends JavaKaraProgram {

    public void myProgram() {
        for (int i = 0; i < 9; i++) {
            kara.putLeaf();
            kara.move();
        }

        for (int i = 0; i < 4; i++) {
            kara.move();
            kara.turnLeft();
            kara.move();
            kara.putLeaf();
            kara.turnRight();
        }

        for (int i = 0; i < 3; i++) {
            kara.move();
            kara.turnRight();
            kara.move();
            kara.putLeaf();
            kara.turnLeft();
        }
        kara.move();
    }
}