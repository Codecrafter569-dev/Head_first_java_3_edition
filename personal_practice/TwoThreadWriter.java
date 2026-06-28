import java.util.*;
import java.util.concurrent.*;

public class TwoThreadWriter{
public static void main(String args[]){
ExecutorService pool = Executors.newFixedThreadPool(2);
Data data = new Data();
pool.execute(() -> addLetterToData('a',data));
pool.execute(() -> addLetterToData('A',data));
pool.shutdown();
}
private static void addLetterToData(char letter , Data data){
for(int i = 0; i< 26; i++){
data.addLetter(letter++);
try{
Thread.sleep(50);	
	
}catch(InterruptedException e){
	System.out.println(e);
}
}	
System.out.println(Thread.currentThread().getName() + data.getLetter());
System.out.println(Thread.currentThread().getName()+"size = "+data.getLetter().size());	
}
}

final class Data{
	
private final List<String> letters = new ArrayList<>();	
public List<String> getLetter(){
	
return letters;	
}
public synchronized void addLetter(char letter){
letters.add(String.valueOf(letter));	
	
}
}