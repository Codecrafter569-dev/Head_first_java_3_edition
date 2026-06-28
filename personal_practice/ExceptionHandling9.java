public class ExceptionHandling9{
public static void main(String args[]){
try{
int[] number = {1,3,4,6};	
	System.out.println(number[7]);// throw ArrayIndexOutOfBoundsException
	
}catch(ArrayIndexOutOfBoundsException e){
	System.out.println("Invalid arrays index :"+e.getMessage());
	
}finally{
	System.out.println("Cleanup code executed .");
	
}
}

}