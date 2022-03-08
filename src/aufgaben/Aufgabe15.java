package aufgaben;

import javakara.JavaKaraProgram;

public class Aufgabe15 extends JavaKaraProgram {

    public void myProgram() {
        String wort = "FF";

        for (int i = 0; i < 3; i++) {
            world.clearAll();
            kara.setPosition(0, world.getSizeY() - 1);
            gehen(wort, 3);
            wort = ersetzen(wort);
            tools.sleep(300);
        }
        world.clearAll();
        kara.setPosition(0, world.getSizeY() - 1);
        gehen(wort, 3);
    }

    String ersetzen(String string) {
        String find = "F";
        String replace = "FLFRFRFLF";
        String result = "";
        int index = 0;

        while (index <= string.length() - find.length()) {
            String temp = string.substring(index, index + find.length());

            if (temp.equals(find)) {
                result += replace;
                index += find.length();
            } else {
                result += temp;
                index++;
            }
        }
        return result;
    }

    void gehen(String wort, int schritt) {
        for (int i = 0; i < wort.length(); i++) {
            if (wort.charAt(i) == 'F') {
                for (int j = 0; j < schritt; j++) {
                    if (!kara.onLeaf()) {
                        kara.putLeaf();
                    }
                    kara.move();
                }
            } else if (wort.charAt(i) == 'L') {
                kara.turnLeft();
            } else if (wort.charAt(i) == 'R') {
                kara.turnRight();
            }
        }
    }
}