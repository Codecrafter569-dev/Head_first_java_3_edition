import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent; 
import javax.swing.event.ListSelectionListener;
public class JListTest{
	JList<String> list;
public static void main(String args[]){
JListTest gui = new JListTest();
gui.go();
}
public void go(){
	String[] listEntries = {"alpha","beta","gamma","delta","epsilon","zeta","eta","theta","kiko"};
	 list = new JList<>(listEntries);
	
          JFrame frame = new JFrame();	
          JPanel panel = new JPanel();	
		  JScrollPane scroller = new JScrollPane(list);
		  scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	      scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		  list.setVisibleRowCount(3);
		  list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		  
		 list.addListSelectionListener(new ListSelectionListener() { 
@Override 
public void valueChanged(ListSelectionEvent e) {
 if (!e.getValueIsAdjusting()) { // Prevent duplicate 
String se = list.getSelectedValue();
System.out.println(se);
 }
 
}
 });
		  
		  panel.add(scroller);
          frame.getContentPane().add(BorderLayout.CENTER,panel);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(500,500);
          frame.setVisible(true);	
}


}