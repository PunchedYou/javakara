package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe3 extends JavaKaraProgram {

    public void myProgram() {
        while (!kara.treeFront()) {
            if (kara.treeRight() && kara.treeLeft()) {
                break;
            }
            kara.move();
        }
        while (kara.treeRight() && kara.treeLeft()) {
            kara.move();
        }
    }
}