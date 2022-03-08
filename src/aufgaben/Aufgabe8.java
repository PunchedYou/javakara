package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe8 extends JavaKaraProgram {

    public void myProgram() {
        while (true) {
            if (!kara.treeFront() && kara.treeRight()) {
                kara.move();
            } else if (kara.treeFront()) {
                kara.turnLeft();
            } else {
                kara.turnRight();
                kara.move();
            }
        }
    }
}