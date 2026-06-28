import java.io.*;

public class Test_I_O implements Serializable{
	private int hight;
	private int width;
	public Test_I_O(int hight , int width){
	this.hight = hight;
    this.width = width;	
	}
public static void main(String args[]){
Test_I_O testDrive = new Test_I_O(456,7895);
Dog dog = new Dog(34,56);

try{
	FileOutputStream fs = new FileOutputStream("foo.ser");
	ObjectOutputStream os = new ObjectOutputStream(fs);
	//we are saveing this Object.
	os.writeObject(dog);
	os.writeObject(testDrive);
	os.close();
	System.out.println("object successful save **");
	
}catch(Exception e){
System.out.println(e);	
}
}
}
class Dog implements Serializable{
private int size;
private int wathe;
public Dog(int size , int wathe){
this.size = size;
this.wathe = wathe;
}	
	
}