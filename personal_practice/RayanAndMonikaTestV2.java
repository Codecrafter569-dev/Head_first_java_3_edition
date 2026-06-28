import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
public class RayanAndMonikaTestV2{
  public static void main(String args[]){
  BankAccount account = new BankAccount();
  RayanAndMonikaJob rayan = new RayanAndMonikaJob("rayan",account,50);
  RayanAndMonikaJob monica = new RayanAndMonikaJob("monica",account,100);
  ExecutorService executor = Executors.newFixedThreadPool(2);
  executor.execute(rayan);
  executor.execute(monica);
  executor.shutdown();
  }

}
class RayanAndMonikaJob implements Runnable{
private final String name;
private final BankAccount account;
private final int amountToSpend;
public RayanAndMonikaJob(String name , BankAccount account , int amountToSpend){
this.name = name;
this.account = account;
this.amountToSpend = amountToSpend;

}
@Override	
public void run(){
goShopping(amountToSpend);

}
public void goShopping(int amount){
System.out.println(name+" is about to spend");
account.spend(name,amount);
System.out.println(name+" finishes spending");	
	

}	
}

class BankAccount{
private final AtomicInteger balance = new AtomicInteger(100);

public int getBalance(){
return balance.get();
}	
public  void spend(String name ,int amount){
	int initialBalance = balance.get();
if(initialBalance >= amount){	
boolean success = balance.compareAndSet(initialBalance , initialBalance - amount);
if(!success){
System.out.println("Sorry "+name+", you haven't spent the money.");	
	
}



}else{
System.out.println("Sorry , not enough for "+name);	
	
}
}	
}