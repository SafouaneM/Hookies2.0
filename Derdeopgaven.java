package AndereVersie.Opdrachten;

import java.applet.Applet;
import java.awt.*;

public class Derdeopgaven extends Applet {
    int a;
    int b;
    double uitkomst;

    public void init() {
        a = 2147483647;
        b = 2147483647;
        uitkomst = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("de uitkomst is: " + uitkomst, 20, 20);
    }

}