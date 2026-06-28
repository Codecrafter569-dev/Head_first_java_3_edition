public class ThreadExampleWithRunnable{
public static void main(String args[]){
MyRunnable r = new MyRunnable();
MyRunnable r2 = new MyRunnable();
MyRunnable1 r11 = new MyRunnable1();
Thread thread = new Thread(r);
Thread thread1 = new Thread(r2);
Thread thread2 = new Thread(r11);
thread2.start();
thread1.start();
thread.start();

}

}
class MyRunnable implements Runnable{
@Override
public void run(){
	int i = 1;
	while(i <40){
System.out.println("Thread is running: " + Thread.currentThread().getName());
i++;
	}
}	
	
}

class MyRunnable1 implements Runnable{
@Override
public void run(){
	int i = 1;
	while(i < 40 ){
System.out.println("Thread is running: " + Thread.currentThread().getName() +" this is a new Thread");
i++;
	}
}	
	
}