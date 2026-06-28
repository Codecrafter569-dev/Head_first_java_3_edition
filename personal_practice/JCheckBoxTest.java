import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JCheckBoxTest{
	private JCheckBox checkBox;
       public static void main(String args[]){
	   JCheckBoxTest gui = new JCheckBoxTest();
	   gui.go();
	   }
       public void go (){
		  JFrame frame = new JFrame();
		  JPanel panel = new JPanel();
		   checkBox = new JCheckBox("Please tick");
		  checkBox.addItemListener(new CheckIt());
	      panel.add(checkBox);
          frame.getContentPane().add(BorderLayout.CENTER,panel);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(500,500);
          frame.setVisible(true);
//select or deselect it in code
/*
checkBox.setSelect(true);
checkBox.setSelect(false);
*/		  
	   }
	   class CheckIt implements ItemListener{
		 @Override
             public void itemStateChanged(ItemEvent e){
              String onOff = "off";
			  if(checkBox.isSelected()){
				  onOff = "on";
			  }
			  System.out.println("Check Box is :"+onOff);

			 }			   
		   
	   }
}