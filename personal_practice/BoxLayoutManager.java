import javax.swing.*;
import java.awt.*;

public class BoxLayoutManager{
public static void main(String args[]){
BoxLayoutManager gui = new BoxLayoutManager();
gui.go();
}
public void go(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("viks");
	JButton button1 = new JButton("Kiko's");
	JButton button2 = new JButton("deep");
	panel.setBackground(Color.green);
	panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
	  panel.add(button);
	  panel.add(button1);
	  panel.add(button2);
	  frame.getContentPane().add(BorderLayout.EAST,panel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(300,300);
  frame.setVisible(true);	
}
}