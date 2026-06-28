import java.util.concurrent.*;

public class ExecutorTestDrive{
public static void main(String args[]){
ExecutorService executor = Executors.newSingleThreadExecutor();
// you can do same things using ThreadClass
for(int i = 1; i< 45; i++){
executor.execute(() -> System.out.println("top o' the Stack"));
System.out.println("back in main");
}
executor.shutdown();

}

}
