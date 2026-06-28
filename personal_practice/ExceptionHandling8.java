class CustomException extends Exception{
public CustomException(String message){

super(message);
}	
	
}



public class ExceptionHandling8{
public static void main(String args[]){
try{
	
	validateAge(12); //Throws CustomException
}catch(CustomException e){
	
System.out.println(e.getMessage());	
}

}
public static void validateAge(int age) throws CustomException{
if(age < 18){

throw new CustomException("Age must be 18 or above .");
}	
	
	
}
}