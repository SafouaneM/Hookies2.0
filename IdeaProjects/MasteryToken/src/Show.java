import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.blue);
    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("Welcome to Java!", 50, 60);
        g.setColor(Color.yellow);
        g.drawString("Safouane", 100, 30);




    }

}