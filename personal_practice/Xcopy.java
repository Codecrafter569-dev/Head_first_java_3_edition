public class Xcopy{
public static void main(String args[]){
int orig = 43;
Xcopy x = new Xcopy();
float y = x.go(orig);
System.out.println(orig+" "+y );
}
int go(int arg){
arg = arg *4;
return arg;
}
}