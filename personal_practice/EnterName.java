import java.util.Scanner;
public class EnterName{
public static void main(String args[]){
System.out.println("enter his/has");

Scanner sc = new Scanner(System.in);
String type = sc.nextLine();

if(type.equals("his")){

System.out.println("hello vikash , have a good day");

}else if (type.equals("has")){

System.out.println("hello girls , you have a nise day ");

}else{
System.out.println("invalid String !!! :( ");
System.out.println("please enter his/has");
main(args);
}
}
}