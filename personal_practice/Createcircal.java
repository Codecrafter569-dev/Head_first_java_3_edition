import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Createcircal{

public static void main(String args[]){
	JFrame jframe = new JFrame();
	DrawCircal panel = new DrawCircal();
	jframe.getContentPane().add(panel);
jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.setSize(500,500);
	jframe.setVisible(true);
}
}
class DrawCircal extends JPanel{
public void paintComponent(Graphics g){
g.fillRect(0,0, this.getWidth() , this.getHeight());

Random random = new Random();
int red = random.nextInt(256);
int green = random.nextInt(256);
int blue = random.nextInt(256);

Color randomColor = new Color(red,green,blue);
g.setColor(randomColor);
g.fillOval(70,70,100,100);
}	
}