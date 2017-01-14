/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class Proj06Runner.MouseHandler
extends MouseMotionAdapter {
    Proj06Runner.MouseHandler() {
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {
        Proj06Runner.this.thisFrame.setForeground(Color.red);
        Proj06Runner.this.xCoor = mouseEvent.getX();
        Proj06Runner.this.yCoor = mouseEvent.getY();
        Proj06Runner.this.thisFrame.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        Proj06Runner.this.thisFrame.setForeground(Color.black);
        Proj06Runner.this.xCoor = mouseEvent.getX();
        Proj06Runner.this.yCoor = mouseEvent.getY();
        Proj06Runner.this.thisFrame.repaint();
    }
}
