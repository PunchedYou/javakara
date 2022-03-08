package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe9 extends JavaKaraProgram {

    public void myProgram() {
        while (true) {
            while (kara.treeLeft() && !kara.treeRight()) {
                kara.move();
                kara.turnLeft();
                kara.move();
            }
            kara.move();
            kara.turnRight();
            kara.move();
            while (!kara.treeLeft() && kara.treeRight()) {
                kara.move();
                kara.turnRight();
                kara.move();
            }
            kara.move();
            kara.turnLeft();
            kara.move();
        }
    }
}