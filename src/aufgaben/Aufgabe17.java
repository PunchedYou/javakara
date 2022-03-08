package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe17 extends JavaKaraProgram {

    final double ITERATIONS = 100;

    final double X_MIN = -2;
    final double X_MAX = 1.4;
    final double Y_MIN = -2;
    final double Y_MAX = 1.4;

    int b;
    int h;

    public void myProgram() {
        b = world.getSizeX();
        h = world.getSizeY();

        world.clearAll();

        for (int row = 0; row < h; row++) {
            for (int col = 0; col < b; col++) {
                double x = berechneApfelX(col);
                double y = berechneApfelY(row);

                int i = fahrstreckentest(x, y);
                if (i == ITERATIONS) {
                    world.setLeaf(col, row, true);
                    tools.checkState();
                }
            }
        }
    }

    int fahrstreckentest(double x, double y) {
        double tempX = 0, tempY = 0;
        int i = 0;

        do {
            double temp2X, temp2Y;
            i++;
            temp2X = tempX * tempX - tempY * tempY + x;
            temp2Y = 2 * tempX * tempY + y;
            tempX = temp2X;
            tempY = temp2Y;
        } while (((tempX * tempX + tempY * tempY) <= 4) && (i < ITERATIONS));

        return i;
    }

    double berechneApfelX(int col) {
        return X_MIN + col * (X_MAX - X_MIN) / b;
    }

    double berechneApfelY(int row) {
        return Y_MIN + row * (Y_MAX - Y_MIN) / h;
    }
}