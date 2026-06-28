public class InnerClassTest{
public static void main(String args[]){
OuterClass outerclass = new OuterClass();
outerclass.testInnerClass();
outerclass.run();
outerclass.go();
OuterClass.InnerClass inner = outerclass.new InnerClass();
inner.go();
inner.run();
}
}
//this  is our outerclass 
class OuterClass{
	InnerClass innerclass = new InnerClass();
	private int a = 4564;
public void testInnerClass(){
	innerclass.go();
	innerclass.run();
}
public void go(){
System.out.println(" I am going with *OuterClass* and with go method."+innerclass.size);	
} 

public void run(){
System.out.println(" I am going with *OuterClass* and with run method."+innerclass.size);		
}
//this is our innerclass
class InnerClass{
	int size = 45;
public void go(){
System.out.println(" I am going with *Innerclass* and with go method."+a);	
} 

public void run(){
System.out.println(" I am going with *Innerclass* and with run method."+a);		
}
}	
	
	
	
}