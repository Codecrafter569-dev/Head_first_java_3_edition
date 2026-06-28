import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
public class CircleButton implements ActionListener{
private JFrame jframe;
public static void main(String args[]){
CircleButton gui = new CircleButton();
gui.go();
}
public void go(){
	DrawPanel panel = new DrawPanel();
jframe = new JFrame();
JButton button = new JButton("Change color");

button.addActionListener(this);
jframe.getContentPane().add(BorderLayout.SOUTH,button);
jframe.getContentPane().add(BorderLayout.CENTER,panel);
jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.setSize(500,500);
	jframe.setVisible(true);	
}
public void actionPerformed(ActionEvent e){
	jframe.repaint();
}
}
class DrawPanel extends JPanel{
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