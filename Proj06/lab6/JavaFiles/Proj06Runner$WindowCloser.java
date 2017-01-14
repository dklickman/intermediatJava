
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Proj06Runner.WindowCloser
extends WindowAdapter {
    Proj06Runner.WindowCloser() {
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }
}
