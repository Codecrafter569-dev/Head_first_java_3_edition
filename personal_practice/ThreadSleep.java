import java.util.concurrent.*;
public class ThreadSleep{
public static void main(String args[]){
ExecutorService executor =Executors.newSingleThreadExecutor();
executor.execute(() -> sleepThanPrint());
System.out.println("back in main");
executor.shutdown();
}
public static void sleepThanPrint(){
	try{
    TimeUnit.SECONDS.sleep(2);	
		
	}catch(InterruptedException e){
	System.out.println(e);	
	}
	System.out.println("top o' the stack");
}
}