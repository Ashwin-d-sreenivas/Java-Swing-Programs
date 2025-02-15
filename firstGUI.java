
import javax.swing.*;
import java.awt.*;

public class firstGUI{
	public static void main(String[] args){
		Abc obj=new Abc();
		
	}
}


class Abc extends JFrame{
	public Abc(){
		
		JLabel l=new JLabel("hello world");
		JLabel l1=new JLabel("welcome");
		add(l1);
		add(l);


		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
