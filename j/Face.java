import java.applet.*;
import java.awt.*;
public class Face extends Applet
{
public void paint(Graphics g)



{
g.drawOval(10,10,200,200);
g.fillOval(55,40,20,20);
g.fillOval(140,40,20,20);
g.drawLine(110,55,110,110);
g.drawArc(60,50,90,120,0,-180);
}
}
