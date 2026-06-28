public class MyRunnable23{

public static void main(String args[]){
MyRunnable2 r = new MyRunnable2();
Thread tr = new Thread(r);
r.run();
tr.start();
System.out.println(Thread.currentThread().getName()+ " Back in main");	
Thread.dumpStack();

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