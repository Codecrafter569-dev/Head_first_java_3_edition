import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.util.Random;
public class DailyAdviceServer{
final private String[] adviceList = {"Take smaller bits","Go for the tight jeans. No they do Not make you look fat","One word : inapropriate","Just for today ,be honest. Tell your boss what you *really* think","you might want to read Head first java","If you want to complete DSA","Java is a popoler Programming language for app","Hello "};
private final Random random = new Random();
public static void main(String args[]){
new DailyAdviceServer().go();

}
public void go(){
try(ServerSocketChannel serverChannel = ServerSocketChannel.open()){
serverChannel.bind(new InetSocketAddress(5000));


while(serverChannel.isOpen()){
SocketChannel clintChannel = serverChannel.accept();
PrintWriter writer = new PrintWriter(Channels.newOutputStream(clintChannel));
String advice = getAdvice();
writer.println(advice);
writer.close();
System.out.println(advice);
}	
}catch(IOException e){
	System.out.println(e);
}
}
private String getAdvice(){
	int nextAdvice = random.nextInt(adviceList.length);
	return adviceList[nextAdvice];
}
}