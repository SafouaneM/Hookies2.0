package h4.H43;

import java.awt.*;
import java.applet.*;

public class Vlad extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.drawRect(80,170,10,80);
        g.setColor(Color.red);
        g.drawRect(90,105,10,85);
        g.fillRect(90,105,10,85);
        g.setColor(Color.white);
        g.drawRect(100,105,10,85);
        g.fillRect(100,105,10,85);
        g.setColor(Color.blue);
        g.drawRect(110,105,10,85) ;
        g.fillRect(110,105,10,85);
    }
}