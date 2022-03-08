package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe1 extends JavaKaraProgram {

    public void myProgram() {
        while (!kara.treeFront()) {
            if (kara.onLeaf()) {
                kara.removeLeaf();
            } else {
                kara.putLeaf();
            }
            kara.move();
        }
        if (kara.onLeaf()) {
            kara.removeLeaf();
        } else {
            kara.putLeaf();
        }
    }
}