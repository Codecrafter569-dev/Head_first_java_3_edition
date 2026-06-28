import javax.swing.*;
import java.awt.*;

public class TwoDCircal{
public static void main(String args[]){
	JFrame jframe = new JFrame();
	Draw2DCircal panel = new Draw2DCircal();
jframe.getContentPane().add(panel);
jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.setSize(500,500);
	jframe.setVisible(true);
}

}

class Draw2DCircal extends JPanel{
public void paintComponent(Graphics g){
Graphics2D g2d = (Graphics2D)g;
GradientPaint ggs = new GradientPaint(70,80,Color.red,150,150,Color.orange);
g2d.setPaint(ggs);
g2d.fillOval(60,60,100,100);
}	
}