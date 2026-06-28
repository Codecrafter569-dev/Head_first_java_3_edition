import java.util.concurrent.*;
public class MyRunnable23V2{

public static void main(String args[]){
MyRunnable2 r = new MyRunnable2();
//this is a much batter than Threadclass . we can do same thing using ExecutorService .
//like this
ExecutorService executor = Executors.newSingleThreadExecutor();
//r is represent a job of a Thread.

executor.execute(r);
System.out.println(Thread.currentThread().getName()+ " Back in main");	
Thread.dumpStack();
//if you don't shutdown the executor.executor wants more jobs.

executor.shutdown();

}
}
class MyRunnable2 implements Runnable{
@Override
public void run(){
go();

}	
	public void go(){
	doMore();	
		
	}
	public void doMore(){
	System.out.println(Thread.currentThread().getName()+ " : top o' the stack");	
		Thread.dumpStack();
	}
}