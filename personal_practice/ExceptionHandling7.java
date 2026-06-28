public class ExceptionHandling7{
public static void main(String args[]){
try{
String str = null;
System.out.println(str.length()); //Throw NullPointerException		
}catch(ArithmeticException e){
	System.out.println("ArithmeticException exception occurred.");
}catch(NullPointerException e){
    System.out.println("NullPointerException exception occurred .");	
}catch(Exception e){	
    System.out.println("General exception occurred. ");	
}
}
}