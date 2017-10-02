package AndereVersie.Opdrachten;
import java.applet.Applet;
import java.awt.*;

public class Opdr2 extends Applet {

    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {
        a = 59;
        b = 24;
        c = 365;


        uitkomst = a * a;
    }

    public void paint(Graphics g) {
        g.drawString("Ongeveer " + uitkomst + " Seconden in een uur", 20, 20);

        uitkomst = a * a * b;
        g.drawString("En er zijn ook " + uitkomst + " Seconden in een dag", 20, 40);

        uitkomst = c * a * a * b;
        g.drawString("En zoveel " + uitkomst + " Seconden in een jaar", 20, 60);

    }

}