package arrays;

import javakara.JavaKaraProgram;

public class Alarm extends JavaKaraProgram {

    public void myProgram() {
        boolean blaetter[][] = new boolean[9][8];

        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 9; x++) {
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

        boolean check = true;

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                if (blaetter[j][i] && blaetter[j + 1][i]) {
                    check = false;
                }
                if (blaetter[i][j] && blaetter[i][j + 1]) {
                    check = false;
                }
            }
        }

        if (check) {
            tools.showMessage("Ok");
        } else {
            tools.showMessage("Alarm");
        }
    }
}
