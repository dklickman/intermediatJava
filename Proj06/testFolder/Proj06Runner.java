
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseAdapter;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;



class Proj06Runner extends Frame {
    int xCoor;
    int yCoor;
    Proj06Runner thisFrame;

    public Proj06Runner() {
        this.setTitle("David Klickman");
        this.setSize(300, 200);
        this.setVisible(true);
        this.thisFrame = this;
        this.addWindowListener((WindowListener)new WindowCloser(this));
        this.addMouseMotionListener((MouseMotionListener)new MouseHandler(this));
        
        
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.drawString("" + this.xCoor + ", " + this.yCoor, this.xCoor, this.yCoor);
    }
}
