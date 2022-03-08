package arrays;

import javakara.JavaKaraProgram;

public class Bilder extends JavaKaraProgram {

    public void myProgram() {
        int x = world.getSizeX();
        int y = world.getSizeY();
        boolean zeile[] = new boolean[x];

        for (int j = 0; j < x; j++) {
            if (kara.onLeaf()) {
                zeile[j] = true;
            }
            kara.move();
        }

        kara.turnRight();
        kara.move();
        kara.turnLeft();

        for (int i = 0; i < y - 1; i++) {

            for (int j = 0; j < x; j++) {
                if (zeile[j]) {
                    kara.putLeaf();
                }
                kara.move();
            }

            kara.turnRight();
            kara.move();
            kara.turnLeft();
        }
    }
}