import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class TwoDCircal1{
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
Random random1 = new Random();
int red = random1.nextInt(256);
int green = random1.nextInt(256);
int blue = random1.nextInt(256);
Color color1 = new Color(red , green , blue);


red = random1.nextInt(256);
green = random1.nextInt(256);
blue = random1.nextInt(256);
Color color2 = new Color(red , green , blue);
GradientPaint ggs = new GradientPaint(70,80,color1,150,150,color2);
g2d.setPaint(ggs);
g2d.fillOval(60,60,100,100);
}	
}