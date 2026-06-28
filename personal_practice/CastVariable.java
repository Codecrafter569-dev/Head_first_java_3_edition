public class CastVariable{
public static void main(String args[]){
long y = 295552L;
int x =(int) y;
short z = (short) x;
byte b = (byte) z;
System.out.println(z+" "+x + " "+y+" "+b);
}
}