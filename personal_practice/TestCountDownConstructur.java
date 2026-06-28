import java.util.concurrent.*;
public class TestCountDownConstructur{

public static void main(String args[]){
ExecutorService executor = Executors.newSingleThreadExecutor();
CountDownLatch latch = new CountDownLatch(1);
executor.execute(() -> testCountLatch(latch));
System.out.println("back in main");
latch.countDown();
executor.shutdown();
}
public static void testCountLatch(CountDownLatch c){
try{
	//this method is tell wait the prticura line of code is executed you can run again .this is like a sleep,but prefact time.
c.await();

}catch(InterruptedException fe){
System.out.println(fe);

}	
System.out.println("top o' the stack");	
}
}