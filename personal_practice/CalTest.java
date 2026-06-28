import java.util.*;
public class CalTest{
public static void main(String args[]){
Cal c = new Cal();
c.setValue(67,56);
System.out.println("the value of a and b is :"+c.getValue());
}
}

class Cal{
private int cvalue;
public int getValue(){
return cvalue;
}
public void setValue(int a,int b){
Scanner sc = new Scanner(System.in);
System.out.println("enter -> /,*,-,,+");
String t =sc.next();
switch(t){
case "+" : cvalue = a+b;
break;
case "-" : cvalue = a-b;
break;
case "*" : cvalue = a*b;
break;
case "/" : cvalue = a/b;
break;
default : System.out.println("rong input !");
}
}
}