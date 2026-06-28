import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class  AnonymousTest5{

public static void main(String args[]){
JButton button = new JButton("Click me");
button.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Button clicked");
	}
});
JFrame frame = new JFrame();
frame.add(button);
frame.setSize(200,200);
frame.setVisible(true);
}
}