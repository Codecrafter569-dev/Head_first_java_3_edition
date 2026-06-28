import javax.swing.*;
import java.awt.*;

public class ExerciseGUI{
public static void main(String args[]){
ExerciseGUI gui = new ExerciseGUI();
gui.go();
}
public void go(){
JFrame frame = new JFrame();
JPanel panel  = new JPanel();
panel.setBackground(Color.green);
JButton button = new JButton("Vikash");
JButton buttontwo = new JButton("Kumar");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
panel.add(button);
frame.getContentPane().add(BorderLayout.NORTH,buttontwo);
frame.getContentPane().add(BorderLayout.EAST,panel);
frame.setSize(500,300);
	frame.setVisible(true);
}
}