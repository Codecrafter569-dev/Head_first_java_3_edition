import javax.swing.*;
import java.awt.*;

public class BoxLayoutManager1{
public static void main(String args[]){
BoxLayoutManager1 gui = new BoxLayoutManager1();
gui.go();
}
public void go(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JButton button = new JButton("viks");
	JButton button1 = new JButton("Kiko's");
	JButton button2 = new JButton("deep");
	JButton button3 = new JButton("Null this is not value");
	panel.setSize(150,150);
	
	panel1.setBackground(Color.blue);
	panel.setBackground(Color.green);
	panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
	  panel.add(button);
	  panel.add(button1);
	  panel.add(button2);
	  
	  panel1.add(panel);
	  panel1.add(button3);
	  
	  frame.getContentPane().add(BorderLayout.EAST,panel1);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(300,300);
  frame.setVisible(true);	
}
}