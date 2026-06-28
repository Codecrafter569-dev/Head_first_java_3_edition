import java.io.*;
import java.net.*;
public class Pood implements Serializable{
public static void main(String args[]){
	Dog dog = new Dog();
	//save the Object
try{
ObjectOutputStream os = new ObjectOutputStream( new FileOutputStream("ks.sar"));
os.writeObject(dog);
os.close();	
	dog.go1();
}catch(Exception e){
System.out.println(e);	
}
//restore the Object
try{
ObjectInputStream is = new ObjectInputStream(new FileInputStream("ks.sar"));	
Dog dog1 = (Dog)is.readObject();
is.close();	
dog1.go();
System.out.println(dog1.size + " "+dog1.speed);
}catch(Exception e){
System.out.println(e);	
}

}
}

class Dog implements Serializable{
	int size = 234;
	//compiler ignor to save it
transient int speed = 45;
	
public void go(){
	System.out.println("I am going");
}
public void go1(){
     System.out.println("Dog Object save");	
}
}