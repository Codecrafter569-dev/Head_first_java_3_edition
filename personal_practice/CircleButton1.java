import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;


public class CircleButton1 implements ActionListener{
	private JFrame jframe;
	private JLabel jlable;
	private JButton colorButton;
public static void main(String args[]){
CircleButton1 gui = new CircleButton1();
gui.go();
}
public void go(){
	jframe = new JFrame();
	JButton lableButton = new JButton("Change lable");
	colorButton = new JButton("color change");
	jlable = new JLabel("I'm lable");
	DrawPanels panel = new DrawPanels();
	colorButton.addActionListener(this);
	lableButton.addActionListener(this);
jframe.getContentPane().add(BorderLayout.SOUTH,colorButton);
jframe.getContentPane().add(BorderLayout.EAST,lableButton);
jframe.getContentPane().add(BorderLayout.CENTER,panel);
jframe.getContentPane().add(BorderLayout.WEST,jlable);
jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.setSize(500,500);
	jframe.setVisible(true);	
}
public void actionPerformed(ActionEvent e){
	if(e.getSource()  == colorButton ){
		jframe.repaint();
	}else{
		jlable.setText("ouch !!!!");
		
	}
}

}

 class DrawPanels extends JPanel{
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