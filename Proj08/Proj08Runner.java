// import all the required libs 
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.event.ChangeListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;


class Proj08Runner
  extends JFrame
{
  
  private JPanel mainPanel = new JPanel();
  
  private JPanel titlePanel = new JPanel();
  
  private JSlider slider = new JSlider();
  
  private JLabel jLabel = new JLabel("50");
  
  public Proj08Runner()
  {
    setDefaultCloseOperation(3);
    
    this.slider.setMajorTickSpacing(10);
    
    this.slider.setMinorTickSpacing(5);
    
    this.slider.setPaintTicks(true);
    
    
    this.slider.setPaintLabels(true);
    
    this.mainPanel.setLayout(new BorderLayout());
    
    this.titlePanel.add(this.jLabel);
    
    this.mainPanel.add(this.titlePanel, "North");
    
    this.mainPanel.add(this.slider, "Center");
    
    getContentPane().add(this.mainPanel);
    pack();
    
    setSize(400, 150);
    setTitle("David Klickman");
    setVisible(true);
    
    this.slider.addChangeListener(new ChangeListener()
    {
      public void stateChanged(ChangeEvent anonChangeEvent)
      {
        
        
        Proj08Runner.this.jLabel.setText("" + Proj08Runner.this.slider.getValue());
      
      
      }
    });
  }
}