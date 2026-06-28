import javax.swing.*;
import java.awt.*;


public class ShowImage0{
public static void main(String args[]){
JFrame jframe = new JFrame();
DrawImage panel = new DrawImage();
jframe.getContentPane().add(panel);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jframe.setSize(500,500);
	jframe.setVisible(true);
}

}
class DrawImage extends JPanel{
	
public void paintComponent(Graphics g){
Image image = new ImageIcon("Kiko.jpg").getImage();
g.drawImage(image , 3 , 4, this);
}	
}