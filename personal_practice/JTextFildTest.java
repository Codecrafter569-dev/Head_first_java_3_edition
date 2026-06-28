import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class JTextFildTest{
public static void main(String args[]){
JTextFildTest gui = new JTextFildTest();
gui.go();
}
public void go() {
JFrame frame  = new JFrame();
JLabel label = new JLabel("you name :");
JTextField fild = new JTextField(20);
JPanel panel = new JPanel();
JButton button1 = new JButton("clearAll Text");
JButton button = new JButton("print");
button.addActionListener(event -> System.out.println(fild.getText()));
button1.addActionListener(event -> fild.setText(""));
//put text in it
//*fild.setText("vikash");*
//get text out of it
//*System.out.println(fild.getText());*

//put the cursor back in the field(so the user can just start typing).
fild.requestFocus();
//you can selectAll text on textbar
fild.selectAll();

panel.add(button);
panel.add(label);
panel.add(fild);
frame.getContentPane().add(BorderLayout.CENTER,panel);
frame.getContentPane().add(BorderLayout.SOUTH,button1);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500,500);
  frame.setVisible(true);	
}

}