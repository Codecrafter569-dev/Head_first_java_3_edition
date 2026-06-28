import javax.swing.*;
import java.awt.*;



public class ExerciseGUI4{

public static void main(String args[]){
ExerciseGUI4 gui = new ExerciseGUI4();
gui.go();
}
public void go(){
JFrame frame = new JFrame();
JPanel panel  = new JPanel();
panel.setBackground(Color.green);
JButton button = new JButton("Vikash");
JButton buttontwo = new JButton("Kumar");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
panel.add(buttontwo);
frame.getContentPane().add(BorderLayout.CENTER,button);
frame.getContentPane().add(BorderLayout.EAST,panel);
frame.setSize(500,300);
	frame.setVisible(true);
}
}