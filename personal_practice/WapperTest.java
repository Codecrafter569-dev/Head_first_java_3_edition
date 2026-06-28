
public class WapperTest{
public static void main(String args[]){
int a = 437;
float b = 2873.5f;
double c = 72935.7393;
short d = 12;
byte e= 45;
char f= 'a';
long g = 89294339483975394L;
boolean h = true;

//wapper classes
Integer iha = Integer.valueOf(a);// wrapping a value
int a1 = iha.intValue();//unwrapping a value

Boolean bha = Boolean.valueOf(h);
boolean a2 = bha.booleanValue();

Character cha = Character.valueOf(f);
char a3 = cha.charValue();

Byte bha1 = Byte.valueOf(e);
byte a4 = bha1.byteValue();

Short sha = Short.valueOf(d);
short a5 = sha.shortValue();

Long lha = Long.valueOf(g);
long a6 = lha.longValue();

Float fha = Float.valueOf(b);
float a7 = fha.floatValue();

Double dha = Double.valueOf(c);
double a8 = dha.doubleValue();
System.out.println(iha+647);//you can print wrapper value ex: bha-> means value of 'a1' and you can perform all operations in WrapperClasses.
System.out.println(a2);
System.out.println(a3);
System.out.println(a4);
System.out.println(a5);
System.out.println(a6);
System.out.println(a7);
System.out.println(a8);

}

}