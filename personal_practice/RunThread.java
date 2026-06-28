import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunThread{

public static void main(String args[]){
ExecutorService threadPool = Executors.newFixedThreadPool(2);
threadPool.execute(() -> runThread("Job 1"));
threadPool.execute(()-> runThread("Job 2"));
threadPool.shutdown();
}
public static void runThread(String str){
	for(int i = 1 ; i<= 25; i++){
	String threadName = Thread.currentThread().getName();
System.out.println(str + "is runing on "+threadName);	
		
	}
	
}
}