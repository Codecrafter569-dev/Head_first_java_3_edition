import javax.swing.*;
import java.awt.*;
public class ButtonAllRision{
public static void main(String args[]){
ButtonAllRision gui = new ButtonAllRision();
gui.go();
}
public void go(){
JFrame jframe = new JFrame();
JButton east = new JButton("East");	
JButton south = new JButton("South");
JButton west = new JButton("West");
JButton north = new JButton("North");
JButton center = new JButton("Center");
jframe.getContentPane().add(BorderLayout.EAST,east);
jframe.getContentPane().add(BorderLayout.WEST,west);
jframe.getContentPane().add(BorderLayout.NORTH,north);
jframe.getContentPane().add(BorderLayout.SOUTH,south);
jframe.getContentPane().add(BorderLayout.CENTER,center);
jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.setSize(500,500);
	jframe.setVisible(true);	
}
}