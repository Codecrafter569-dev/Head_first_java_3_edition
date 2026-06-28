import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
public class DaliyAdviseClint{
public static void main(String args[]){
new DaliyAdviseClint().go();
}
public void go(){
InetSocketAddress server = new InetSocketAddress("127.0.0.1",5000);
try(SocketChannel socketChannel = SocketChannel.open(server)){
Reader channelReader = Channels.newReader(socketChannel,StandardCharsets.UTF_8);
BufferedReader reader = new BufferedReader(channelReader);
String adivace = reader.readLine();
System.out.println("Today you should :"+adivace);
reader.close();
}catch(IOException e){
System.out.println(e);
}	
}
}