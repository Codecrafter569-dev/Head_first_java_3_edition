public class ExceptionHandling5{
 public static void main(String args[]){
 try{
	int result = 10/0;//will throw ArithmeticException 
	 System.out.println("try end");
	 
 }catch(ArithmeticException e){
	 System.out.println("Error : Division by zero is not allowed. ");
	 
	 
 }finally{
System.out.println("Cleanup tasks can be performed here . ");	 
	 
	 
 }
 
 }


}