import javax.swing.*;
import java.awt.*;


public class TestJpanel{
public static void main(String args[]){
TestJpanel gui = new TestJpanel();
gui.go();
}
public void go(){
	JFrame jframe = new JFrame();
	DrawPanel panel = new DrawPanel();
	jframe.getContentPane().add(panel);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.setSize(400,400);
	jframe.setVisible(true);
}

}

class DrawPanel extends JPanel{
public void paintComponent(Graphics g){
g.setColor(Color.blue);
g.fillRect(0,0,100,100);

}	
	
}