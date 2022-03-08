package bilder;

import javakara.JavaKaraProgram;

public class Bild1 extends JavaKaraProgram {

    public void myProgram() {
        for (int i = 0; i < 4; i++) {
            kara.turnLeft();
            kara.putLeaf();
            kara.move();
            kara.turnRight();
            kara.putLeaf();
            kara.move();
            kara.turnLeft();
            kara.putLeaf();
            kara.move();
            kara.turnRight();
            kara.move();

        }
    }
}