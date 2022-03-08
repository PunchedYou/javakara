package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe6 extends JavaKaraProgram {

    public void myProgram() {
        while (!kara.onLeaf()) {
            if (!kara.treeFront()) {
                kara.move();
            } else if (!kara.treeRight()) {
                kara.turnRight();
                kara.move();
            } else if (!kara.treeLeft()) {
                kara.turnLeft();
                kara.move();
            }
        }
        kara.removeLeaf();
    }
}