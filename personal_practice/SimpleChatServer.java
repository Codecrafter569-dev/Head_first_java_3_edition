import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.*;
import java.util.concurrent.*;
import static java.nio.charset.StandardCharsets.UTF_8;

public class SimpleChatServer{
	private final List<PrintWriter> clintWriter = new ArrayList<>();
	
public static void main(String args[]){
new SimpleChatServer().go();
}
public void go(){
ExecutorService threadPool = Executors.newCachedThreadPool();
try{
ServerSocketChannel serverSocketChannels = ServerSocketChannel.open();
serverSocketChannels.bind(new InetSocketAddress(5001));
while(serverSocketChannels.isOpen()){
	SocketChannel clintSocket = serverSocketChannels.accept();
	PrintWriter writer = new PrintWriter(Channels.newWriter(clintSocket,UTF_8));
	clintWriter.add(writer);
	threadPool.submit(new ClientHandler(clintSocket));
	System.out.println("got a connection");
	
}

}catch(IOException e){


}	
}
private void tellEveryone(String message){
for(PrintWriter writer : clintWriter){
writer.println(message);
writer.flush();

}	
}


class ClientHandler implements Runnable{
BufferedReader reader;
SocketChannel socket;
public ClientHandler(SocketChannel clientSocket){
socket = clientSocket;
reader = new BufferedReader(Channels.newReader(socket,UTF_8));

}		
public void run(){
String message;
try{
	while((message = reader.readLine()) != null){
		System.out.println("read"+message);
		tellEveryone(message);
		
	}
	
}catch(IOException e){
System.out.println(e);	
	
	
}

}	
}
}


