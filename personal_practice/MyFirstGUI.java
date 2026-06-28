import javax.swing.*;

public class MyFirstGUI{
public static void main(String args[]){
MyFirstGUI gui = new MyFirstGUI();
gui.go();
}
public void go(){
	//we are creating a frame
	JFrame frame = new JFrame(" GUI CREATED BY VIKASH ");
	
	//WE Are cteating a Button
	JButton button = new JButton(" click me !");
	
	//we are set a frame to when we prace a cut button our program is permnetliy cut
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//we add button to the frame
	frame.getContentPane().add(button);
	frame.setSize(300,300);
	frame.setVisible(true);
}
}