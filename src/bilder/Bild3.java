package bilder;

import javakara.JavaKaraProgram;

public class Bild3 extends JavaKaraProgram {

    public void myProgram() {
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                kara.putLeaf();
                kara.move();
            }
            kara.turnRight();
        }

        world.clearAll();
        kara.setPosition(0, 0);
        kara.turnRight();

        for (int i = 8; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                kara.putLeaf();
                kara.move();
            }
            kara.turnLeft();
        }

    }
}