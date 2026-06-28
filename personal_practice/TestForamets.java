public class TestForamets{
public static void main(String args[]){
Float my1 = 27939539.7294f;
long my = 10000_0000_0000_000L;
String s = String.format("this is long number"+" %,d "+
  "this is float numbers"+" %,.2f ",my,my1);
System.out.println(s);


byte ba1 = 1_2;
short sa = 12_3;
int ia = 7093;
long la = 729388573959739L;
float fa = 7239575.73554f;
double da = 73935835739.739533957;
String sentance = String.format("%,d",ba1);
String sentance1 = String.format("%,d",sa);
String sentance2 = String.format("%,d",ia);
String sentance3 = String.format("%,d",la);
String sentance4 = String.format("%,.3f",fa);
String sentance5 = String.format("%,.3f",da);
System.out.println(sentance );
System.out.println(sentance1 );
System.out.println(sentance2 );
System.out.println(sentance3 );
System.out.println(sentance4 );
System.out.println(sentance5 );
System.out.println(String.format("%x",la));
System.out.println(String.format("%c",ia));
Long tsf = la;
System.out.println(String.format("%x",tsf));
}


}