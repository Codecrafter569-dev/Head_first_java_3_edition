
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.concurrent.*;
import static java.nio.charset.StandardCharsets.UTF_8;

public class SimpleChatClint{
private JTextField outgoing;
private PrintWriter writer;
private JTextArea incomeing;
private BufferedReader reader;
	
public static void main(String args[]){
new SimpleChatClint().go();
}
public void go(){
setUpNetwork();	
JScrollPane scroller = createScrollrableTextArea();

outgoing = new JTextField(20);
JButton sendButton = new JButton("send");
sendButton.addActionListener(e -> sendMessage());

JPanel mainPanel = new JPanel();
mainPanel.add(scroller);
mainPanel.add(outgoing);
mainPanel.add(sendButton);

ExecutorService executor = Executors.newSingleThreadExecutor();
executor.execute(new IncomingReader());
JFrame frame = new JFrame("Ludicrously Simple Chat Clint");
frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
frame.setSize(400,200);
frame.setVisible(true);
frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


}
private JScrollPane createScrollrableTextArea(){
incomeing = new JTextArea(15,30);
incomeing.setLineWrap(true);
incomeing.setWrapStyleWord(true);	
incomeing.setEditable(false);
JScrollPane scroller = new JScrollPane(incomeing);
    scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
return scroller;
	
}
private void sendMessage(){
writer.println(outgoing.getText());	
writer.flush();
outgoing.setText("");
outgoing.requestFocus();
	
}
private void setUpNetwork(){
	try{
	InetSocketAddress serverAdress = new InetSocketAddress("127.0.0.1",5001);
     SocketChannel socketChannel = SocketChannel.open(serverAdress);	
	 writer = new PrintWriter(Channels.newWriter(socketChannel,UTF_8));
	 reader = new BufferedReader(Channels.newReader(socketChannel,UTF_8));
	 System.out.println("Networking established ");
		
	}catch(IOException e){
	System.out.println(e);	
		
	}
	
}

class IncomingReader implements Runnable{
@Override
public void run(){
String message;
try{
while((message = reader.readLine()) != null){
System.out.println("read "+message);
incomeing.append(message +"\n");
}	
	
}catch(IOException e){
System.out.println(e);	
	
}

}	
	
}


}