
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Proj07Runner
  extends JFrame
  implements WindowListener, ActionListener
{
  JButton button1 = new JButton("Left");
  JButton button2 = new JButton("Right");
  JLabel label = new JLabel("Left");
  
  public Proj07Runner()
  {
    getContentPane().setLayout(new FlowLayout(2));
    
    setTitle("David Klickman");
    getContentPane().add(this.button1);
    this.label.setBackground(Color.yellow);
    this.label.setForeground(Color.red);
    this.label.setOpaque(true);
    getContentPane().add(this.label);
    getContentPane().add(this.button2);
    this.button1.addActionListener(this);
    this.button2.addActionListener(this);
    setSize(250, 100);
    setVisible(true);
    
    addWindowListener(this);
  }
  
  public void windowClosing(WindowEvent paramWindowEvent)
  {
    System.exit(0);
  }
  
  public void windowOpened(WindowEvent paramWindowEvent) {}
  
  public void windowClosed(WindowEvent paramWindowEvent) {}
  
  public void windowIconified(WindowEvent paramWindowEvent) {}
  
  public void windowDeiconified(WindowEvent paramWindowEvent) {}
  
  public void windowActivated(WindowEvent paramWindowEvent) {}
  
  public void windowDeactivated(WindowEvent paramWindowEvent) {}
  
  public void actionPerformed(ActionEvent paramActionEvent)
  {
    if (paramActionEvent.getActionCommand().indexOf("Left") != -1) {
      this.label.setText("Left");
    } else {
      this.label.setText("Right");
    }
  }
}
