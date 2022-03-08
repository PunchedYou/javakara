package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe10 extends JavaKaraProgram {

    public void myProgram() {
        int richtung = 0; // 0 = rechts; 1 = links

        while (true) {
            if (richtung == 0) {
                reiheGehen();
                if (!kara.treeRight()) {
                    kara.turnRight();
                    kara.move();
                    kara.turnRight();
                } else {
                    break;
                }
                richtung = 1;
            } else {
                reiheGehen();
                if (!kara.treeLeft()) {
                    kara.turnLeft();
                    kara.move();
                    kara.turnLeft();
                } else {
                    break;
                }

                richtung = 0;
            }
        }
    }

    private void reiheGehen() {
        if (kara.onLeaf()) {
            kara.removeLeaf();
        } else {
            kara.putLeaf();
        }
        while (!kara.treeFront()) {
            kara.move();
            if (kara.onLeaf()) {
                kara.removeLeaf();
            } else {
                kara.putLeaf();
            }
        }
    }
}