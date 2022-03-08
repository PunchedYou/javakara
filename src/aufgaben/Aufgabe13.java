package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe13 extends JavaKaraProgram {

    public void myProgram() {
        while (!kara.onLeaf()) {
            kara.turnRight();
            kara.turnRight();
            while (!kara.treeFront()) {
                kara.move();
            }
            kara.turnRight();
            kara.turnRight();
            while (kara.treeLeft()) {
                kara.move();
            }
            kara.turnLeft();
            kara.move();
            kara.move();
            kara.turnRight();
        }
        kara.removeLeaf();
    }
}