import java.util.Scanner;
public class Calculater{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the first number :");
int a = sc.nextInt();
System.out.println("enter the second number : ");
int b = sc.nextInt();
System.out.println("+,-,*,/");
String c = sc.next();
switch (c){
case "+"  :
System.out.println(a+"+"+b+" = "+a+b);
break;

case "-"  :
System.out.println(a+"-"+b+" = "+(a-b));
break;

case "/"  :
System.out.println(a+"/"+b+" = "+a/b);
break;

case "*" :
System.out.println(a+"x"+b+" = "+a*b);
break;
default:
System.out.println("enter invalid arithmetic ");

}
}

}