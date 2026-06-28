import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
public class CircleButton2{
private JFrame jframe;
private JLabel jlable;
public static void main(String args[]){
CircleButton2 gui = new CircleButton2();
gui.go();
}
public void go(){
	DrawPanel panel = new DrawPanel();
jframe = new JFrame();
jlable = new JLabel("I am lable");
JButton button = new JButton("Change color");
JButton lableButton  = new JButton("Change lable");
button.addActionListener(new ColorClass());
lableButton.addActionListener(new LableClass());
jframe.getContentPane().add(BorderLayout.EAST,lableButton);
jframe.getContentPane().add(BorderLayout.WEST,jlable);
jframe.getContentPane().add(BorderLayout.SOUTH,button);
jframe.getContentPane().add(BorderLayout.CENTER,panel);
jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.setSize(500,500);
	jframe.setVisible(true);	
}
//This is a innerclass
class ColorClass implements ActionListener{
public void actionPerformed(ActionEvent e){
	jframe.repaint();
}
}

//This is a innerclass
class LableClass implements ActionListener{
public void actionPerformed(ActionEvent e){
jlable.setText("Ouchh !");
}	
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