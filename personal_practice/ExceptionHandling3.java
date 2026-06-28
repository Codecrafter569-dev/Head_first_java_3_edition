import java.util.Scanner;
public class ExceptionHandling3{

public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
BadException ba = new BadException();

try{
	System.out.println("entered yes or no");
	String str = sc.next();
ba.go(str);
}catch(BadException b){
System.out.println(b);
b.printStackTrace();	
}
}

}
class BadException extends Exception{
public void go(String an) throws BadException{
if(an.equals("yes")){
throw new BadException();

}else{
System.out.println("not risky");

}	
	
}	
	
	
	
}