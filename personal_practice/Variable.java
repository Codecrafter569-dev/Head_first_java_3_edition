public class Variable{
public static void main(String args[]){
//variables in 
//primitive variables
int a =1234567890;
byte k= 123;
short s = 32767;
long l = 23525295253L;
float f = 4567.7876F;
double d = 6386730.456;
char c ='v';
boolean bh = true;
System.out.println(a+" "+k+" "+s+" "+l+" "+f+" "+d+" "+c+" "+bh+" ");
//non-primitive variables
String name = new String("vikash kumar"); //String name ="vikash kumar";
System.out.println(name);
int arrys[] ={45,56,78,9876,5436,3636,2425,6636,7373};
for (int i=0;i<arrys.length;i++){
System.out.print(arrys[i]+"\t");
}
}

}