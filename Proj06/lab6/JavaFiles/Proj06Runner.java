/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  Proj06Runner$MouseHandler
 *  Proj06Runner$WindowCloser
 */
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowListener;

class Proj06Runner
extends Frame {
    int xCoor;
    int yCoor;
    Proj06Runner thisFrame;

    public Proj06Runner() {
        this.setTitle("Put your name here");
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
