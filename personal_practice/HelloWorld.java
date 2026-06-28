public class HelloWorld{
public static void main(String args[]){
int x = 4;
System.out.println("thera is a new program");
if (x == 4){
System.out.println("x must be :"+x);

}else{
System.out.println("X IS NOT FOR");
}
new Loopy().go();
}

}
class Loopy{
 public void go(){
int x =1;
System.out.println("before the loop");
while(true){
if(x == 7){
break;
}
System.out.println(" run loop "+x+" times");
x++;
}
System.out.println(" after the loop ");

int n = 10;
 if ( n == 111 ){
System.out.println("I ' am 111");

}else{
System.out.println("I ' am not 111");


}
}
}