package h4;

import java.awt.*;
import java.applet.*;

public class Driehoek extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        int[] xPoints = {100,50,150}; int[] yPoints = {100,200,200}; g.drawPolygon(xPoints, yPoints, 3);
    }
}