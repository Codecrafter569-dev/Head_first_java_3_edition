import java.util.concurrent.*;
public class RayanAndMonikaTest{
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
private int balance = 100;
public int getBalance(){
return balance;
}	
public synchronized void spend(String name ,int amount){
if(balance >= amount){	
balance -= amount;
if(balance < 0){
System.out.println("Overdrawn!");	
	
}
}else{
System.out.println("Sorry , not enough for "+name);	
	
}
}	
}