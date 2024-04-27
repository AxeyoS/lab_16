import java.awt.*;
import javax.swing.JFrame;

public class DrawingHouse extends Canvas{
    public static void main(String[] args) {
        JFrame frame = new JFrame("My drawing");
        Canvas canvas = new DrawingHouse();
        canvas.setSize(500,300);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        g.drawRect(50, 150, 150, 150);
        g.drawRect(75, 200, 50, 50);
        g.drawLine(25, 175, 125, 75);
        g.drawLine(125, 75, 225, 175);
        g.drawLine(150, 100, 150, 75);
        g.drawLine(150, 75, 175, 75);
        g.drawLine(175, 75, 175, 125);

        g.drawArc(275, 50, 150, 200, 280, 340);
        g.drawLine(335, 300, 335, 248);
        g.drawLine(365, 300, 365, 248);
    }
}