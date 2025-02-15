
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class addGUI {
  public static void main(String[] args){
      Add obj=new Add();

  }
}

class Add extends JFrame implements ActionListener {
  JTextField t1,t2;
  JButton b1,b2;
  JLabel l;
  ButtonGroup bg;

  public Add(){
    t1=new JTextField(20);
    t2=new JTextField(20);
    b1=new JButton("ADD");
    b2=new JButton("SUB");
   

    l=new JLabel("0");

    add(t1);
    add(t2);
    add(b1);
    add(b2);
    add(l);
    
    b1.addActionListener(this);
    b2.addActionListener(this);

    setLayout(new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400,400);

  }

  public void actionPerformed(ActionEvent ae){

    int num1=Integer.parseInt(t1.getText());
    int num2=Integer.parseInt(t2.getText());
    int value;
    if(ae.getSource()==b1){
      value=num1+num2;
      l.setText(value+"");
    }
    else if(ae.getSource()==b2){
      value=num1-num2;
      l.setText(value+"");
    }
    
    
    
    


  }



}