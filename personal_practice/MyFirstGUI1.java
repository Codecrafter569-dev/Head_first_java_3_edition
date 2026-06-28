import javax.swing.*;
import java.awt.event.*;

public class MyFirstGUI1 implements ActionListener{
	private JButton button;
public static void main(String args[]){
MyFirstGUI1 gui1 = new MyFirstGUI1();
gui1.go(gui1);
}
public void go(MyFirstGUI1 g){
JFrame frame = new JFrame("ActionListener");
button = new JButton("click me");	


button.addActionListener(g);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//we add button to the frame
	frame.getContentPane().add(button);
	frame.setSize(400,400);
	frame.setVisible(true);
}
public void actionPerformed(ActionEvent event){
	button.setText("thanks for click this button");
	System.out.println("thanks for click this button");
}
}