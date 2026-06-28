class UserValidationException extends Exception{
	public UserValidationException(String message){
	super(message);	//pass the message to the Exception class Constructor
		
	}
	
}

public class ExceptionHandling11{
	
	public static void validateUsername(String username) throws UserValidationException{
		if(username == null || username.isEmpty()){
			throw new UserValidationException("Username must be at least 6 characters and underscores. ");
		}
		if(username.length() < 6){
		throw new UserValidationException("Username must be at least 6 characters long .");	
			
		}
		if(!username.matches("[a-zA-Z0-9_ ]+")){
			throw new UserValidationException("Username can only contain alphanumeric characters and underscores.");
		}
		
	}
public static void main(String args[]){
String[] testUsername = {null,"","abc","valid_user","invalid!user","vikash kumar"};

	for(String username : testUsername){
	try{
             validateUsername(username);//Validate each username
			 System.out.println("Username '"+username+"' is valid .");


	}catch(UserValidationException e){

System.out.println("Validation failed for username '" +username+"':"+e.getMessage());
	}		
		
		
	}
	
}

}