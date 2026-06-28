import java.util.Scanner;

public class ExceptionHandling1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int[] arrays = {456,678,8905,12345};
try{
	System.out.println("enter index of a arrays :");
int index = sc.nextInt();
System.out.println("enter a number to divide arrays :");
int num = sc.nextInt();
	System.out.println("this is a value of a index entered by user :"+arrays[index]);
	System.out.println("this is of arrays/numbers : "+arrays[index]/num);
	
}catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);		
}catch(ArithmeticException e){
System.out.println(e);	
}catch(Exception e){
	System.out.println(e);
	System.out.println("in Exception");
	ExceptionHandling1.main(args);	
	
}finally{
System.out.print("your program is finish");	
	
}
System.out.println(" with a return 0");
}

}