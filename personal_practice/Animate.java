import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class Animate{
	int x = 1;
	int y = 1;
public static void main(String args[]){
Animate gui = new Animate();
gui.go();
}
public void go(){
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
DrawP panel = new DrawP();
frame.getContentPane().add(panel);
	frame.setSize(500,300);
	frame.setVisible(true);
for(int i = 0; i < 124 ; i++,y++,x++){
x++;
panel.repaint();
try{
	TimeUnit.MILLISECONDS.sleep(50);
}catch(Exception e){
	
}


}	
}
class DrawP extends JPanel{
public void paintComponent(Graphics g){
	Random random = new Random();
int red = random.nextInt(256);
int green = random.nextInt(256);
int blue = random.nextInt(256);
Color randomColor = new Color(red,green,blue);
g.setColor(Color.white);
g.fillOval(0,0,500,250);
g.setColor(randomColor);
g.fillOval(x,y,500-x*2,250-y*2);

}	
	
}
}