import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JTextAreaTest{
public static void main(String args[]){
JTextAreaTest gui = new JTextAreaTest();
gui.go();
}
public void go(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea fild = new JTextArea(10,20);
	fild.selectAll();
	fild.requestFocus();
	JScrollPane scroller = new JScrollPane(fild);
	fild.setLineWrap(true);
	scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	panel.add(scroller);
	JButton button = new JButton("Print");
	JButton button1  = new JButton("just click");
	JButton button2 = new JButton("Clear All");
	button.addActionListener(event -> System.out.println(fild.getText()));
	button1.addActionListener(event -> fild.append("Thanks for click this button \n"));
	button2.addActionListener(event -> fild.setText(""));
	panel.add(button2);
	panel.add(button1);
	
	
	
	frame.getContentPane().add(BorderLayout.CENTER,panel);
frame.getContentPane().add(BorderLayout.SOUTH,button);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500,500);
  frame.setVisible(true);
}
}