import java.util.Scanner;

public class ExceptionHandling12{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("entered number 0 to 7 :");
	int a = sc.nextInt();
try{
doLaundry(a);	
	
}catch(DressShirtException e){
	System.out.println(e);
}catch(TeeShirtException e){
	System.out.println(e);
}catch(ShirtException e){
	System.out.println(e);
}catch(LingerieException e){
	System.out.println(e);
}catch(PantsException e){
	System.out.println(e);
}catch(ClothingException e){
	System.out.println(e);
}
if(a == 1 || a == 2 || a == 3 || a == 4 || a == 5 || a == 6 ){
main(args);
}
}
public static void doLaundry(int a) throws ClothingException,PantsException,LingerieException,TeeShirtException,DressShirtException,ShirtException{
if( a == 1){
throw new ClothingException();
}else if(a == 2){
throw new PantsException();
}else if(a == 3){
throw new LingerieException();
}else if(a == 4){
throw new ShirtException();
}else if(a == 5){
throw new TeeShirtException();
}else if(a == 6){
throw new DressShirtException();
}else{
System.out.println("risky is done");
}	
	
	
}

}
class ClothingException extends Exception{
	
}
class PantsException extends ClothingException{
	
	
}
class LingerieException extends ClothingException{
	
	
	
}
class ShirtException extends ClothingException{
	
	
}
class TeeShirtException extends ShirtException{
	
	
}
class DressShirtException extends ShirtException{
	
	
}