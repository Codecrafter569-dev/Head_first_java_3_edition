public class MyThread {
public static void main(String args[]){
MyThread2 myThread = new MyThread2();
MyThread2 myThread3 = new MyThread2();
MyThread1 myThread1 = new MyThread1();
myThread.start();
myThread3.start();
myThread1.start();

}

}
class MyThread1 extends Thread{
	@Override
	public void run(){
		int i = 0 ;
		while(i < 40){
System.out.println("Thread is running: " + Thread.currentThread().getName()+"this is a new Thread");	
		i++;	
		}
		
	}
	
}


class MyThread2 extends Thread{
	@Override
	public void run(){
		int i = 0 ;
		while(i < 40){
System.out.println("Thread is running: " + Thread.currentThread().getName());	
		i++;	
		}
		
	}
	
}