abstract class Persion{
abstract void sayHello();	
}


public class AnonymousTest8{
public static void main(String args[]){
Persion anonymousPersion = new Persion(){
	@Override
	void sayHello(){
	System.out.println("Hello from anonymous Persion");	
	}
};
anonymousPersion.sayHello();
}
}