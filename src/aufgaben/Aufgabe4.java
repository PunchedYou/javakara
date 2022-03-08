package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe4 extends JavaKaraProgram {

    public void myProgram() {
        while (!kara.onLeaf()) {
            if (kara.treeFront()) {
                kara.turnLeft();
                kara.move();
                kara.turnRight();
                kara.move();
                kara.move();
                kara.turnRight();
                kara.move();
                kara.turnLeft();
            } else {
                kara.move();
            }
        }
        kara.removeLeaf();
    }
}