import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Radio {
  public static void main(String[] args){
    Radiodemo obj=new Radiodemo();
  }
}

class Radiodemo extends JFrame implements ActionListener {
    JTextField t1;
    JButton b;
    JRadioButton b1,b2;
    JLabel l;
    ButtonGroup bg;

    public Radiodemo(){
      t1=new JTextField(20);
      b=new JButton("SUBMIT");

      b1=new JRadioButton("Male");
      b2=new JRadioButton("Female");
      l=new JLabel("details:");
      bg=new ButtonGroup();
      bg.add(b1);
      bg.add(b2);

      add(t1);
      add(b);
      add(b1);
      add(b2);
      add(l);

      b.addActionListener(this);


      setVisible(true);
      setSize(400,400);
      setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
      
      String name=t1.getText();
      if(b1.isSelected()){
        l.setText("MR."+name);
      }
      else if(b2.isSelected()){
        l.setText("MRS."+name);
      }

    }

}