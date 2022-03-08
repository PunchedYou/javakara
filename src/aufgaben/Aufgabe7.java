package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe7 extends JavaKaraProgram {

    public void myProgram() {
        while (!kara.treeFront()) {
            kara.move();
            if (!kara.onLeaf()) {
                kara.turnLeft();
                kara.turnLeft();
                kara.move();
                kara.turnRight();
                kara.move();
            }
            if (!kara.onLeaf()) {
                kara.turnLeft();
                kara.turnLeft();
                kara.move();
                kara.move();
            }
            kara.removeLeaf();
        }
    }
}