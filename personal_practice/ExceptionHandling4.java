public class ExceptionHandling4{
public static void main(String args[]){
String test = "yes";
try{
	System.out.println("start try");
	doRisky(test);
	System.out.println("End try");
	
}catch(ScaryException e){
	System.out.println("scary Exception");
	
}finally{
	
System.out.println("finally");	
}
System.out.println("End of main");
}
public static void doRisky(String test) throws ScaryException{
System.out.println("start risky");	
if("yes".equals(test)){
throw new ScaryException();	
	
}
	System.out.println("end Risky");
}

}
class ScaryException extends Exception{}