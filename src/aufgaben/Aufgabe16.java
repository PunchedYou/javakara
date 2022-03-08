package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe16 extends JavaKaraProgram {

    public void myProgram() {
        int[] numbers = new int[world.getSizeY()];
        boolean numbersSorted = false;

        for (int y = 0; y < world.getSizeY(); y++) {
            numbers[y] = getNumber(y);
        }

        while (!numbersSorted) {
            numbersSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, i + 1);
                    numbersSorted = false;
                    showNumbers(numbers);
                }
            }
        }
    }

    int getNumber(int y) {
        int length = 0;
        for (int x = 0; x < world.getSizeX(); x++) {
            if (world.isLeaf(x, y)) {
                length++;
            }
        }
        return length;
    }

    void showNumbers(int[] numbers) {
        for (int y = 0; y < world.getSizeY(); y++) {
            for (int x = 0; x < world.getSizeX(); x++) {
                world.setLeaf(x, y, (x < numbers[y]));
            }
        }
        tools.checkState();
    }

    void swap(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
}
