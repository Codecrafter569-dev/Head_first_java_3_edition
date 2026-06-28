import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
public class SimpleAnimation2{
private	MyDrawPanel panel = new MyDrawPanel();
	private int xPos = 70;
	private int yPos = 70;
public static void main(String args[]){
SimpleAnimation2 gui = new SimpleAnimation2();
gui.go();

}
public void go(){
	JFrame frame = new JFrame();
	JButton button = new JButton("change posistion");
	button.addActionListener(new ButtonLis());
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(BorderLayout.SOUTH,button);
	frame.getContentPane().add(panel);
	frame.setSize(300,300);
	frame.setVisible(true);
	
	}
class ButtonLis implements ActionListener{
		public void actionPerformed(ActionEvent e){
	xPos++;
    yPos++;
	panel.repaint();
	}
}
	


class MyDrawPanel extends JPanel{
public void paintComponent(Graphics g){
	g.setColor(Color.white);
	g.fillRect(0,0,this.getWidth(),this.getHeight());
g.setColor(Color.green);	
g.fillOval(xPos,yPos ,40,40);
}
}

}