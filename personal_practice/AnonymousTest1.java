class Persion{
public void seyHello(){
System.out.println("Hello");
}	
}

public class AnonymousTest1{
public static void main(String args[]){
Persion anonymousPersion = new Persion(){
	@Override
	public void seyHello(){
		System.out.println("Hello we are printing useing AnonymousClass");
	}
	
};
anonymousPersion.seyHello();
}

}