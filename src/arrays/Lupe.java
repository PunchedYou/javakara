package arrays;

import javakara.JavaKaraProgram;

public class Lupe extends JavaKaraProgram {

    public void myProgram() {
        boolean blaetter[][] = new boolean[12][12];

        for (int y = 0; y < 12; y++) {
            for (int x = 0; x < 12; x++) {
                if (kara.onLeaf()) {
                    blaetter[x][y] = true;
                } else {
                    blaetter[x][y] = false;
                }
                kara.move();
            }
            kara.turnRight();
            kara.move();
            kara.turnLeft();

        }
    }
}
