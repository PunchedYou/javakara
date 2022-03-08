package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe5 extends JavaKaraProgram {

    public void myProgram() {
        while (!kara.onLeaf()) {
            if (kara.treeFront()) {
                kara.turnLeft();
                kara.move();
                kara.turnRight();
                kara.move();
                while (kara.treeRight()) {
                    kara.move();
                }
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