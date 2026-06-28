import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
public class LostUpdateV2{

public static void main(String args[]){
ExecutorService pool = Executors.newFixedThreadPool(6);
Balance balance = new Balance();
for(int i = 0; i< 1000 ; i++){
pool.execute(() -> balance.increment());	
}
pool.shutdown();
try{
if(pool.awaitTermination(1,TimeUnit.MINUTES)){
System.out.println("balance = " +balance.balance);	
	
}
}catch(InterruptedException e){
System.out.println(e);	
}
}
}
class Balance{

AtomicInteger balance = new AtomicInteger(0);
public  void increment(){
balance.incrementAndGet();
}	
	
}