package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe2 extends JavaKaraProgram {

    public void myProgram() {
        while (!kara.treeFront()) {
            if (kara.treeRight() && kara.treeLeft()) {
                break;
            }
            kara.move();
        }
    }
}