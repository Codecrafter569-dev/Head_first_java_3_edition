public class  AnonymousTest4{
public static void main(String args[]){
Thread anonymousThread = new Thread(){
	@Override
	public void run(){
	System.out.println("Running from anonymous Thread");	
	}
	
};
anonymousThread.start();
}
}