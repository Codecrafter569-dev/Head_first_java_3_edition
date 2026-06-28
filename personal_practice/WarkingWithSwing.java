import javax.swing.*;
import java.awt.*;

public class WarkingWithSwing{
  public static void main(String args[]){
  JFrame frame = new JFrame();
  JButton button = new JButton("This is no spoon...");
  Font bigFont = new Font("sfs",Font.BOLD,28);
  button.setFont(bigFont);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.getContentPane().add(BorderLayout.NORTH,button);
  frame.setSize(300,300);
  frame.setVisible(true);
  
  }
}