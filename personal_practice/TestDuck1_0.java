public class TestDuck1_0{

public static void main(String args[]){
int weight = 8;
float density = 2.3f;
String name = "Donald";
long[] feathere = {1,2,3,4,5,7,6,8,7,3,4,8,7,5,6};
boolean canFly = true;
int airspeed = 23;
Duck[] d = new Duck[7];
d[0] = new Duck();
d[1] = new Duck(density,weight);
d[2] = new Duck(name ,feathere);
d[3] = new Duck(canFly);
d[4] = new Duck(3.5f,airspeed);
d[5]  = new Duck(false);
d[6] = new Duck(airspeed,density);
}

}
class Duck{
private int kilos = 6;
private float floatability = 23.5f;
private String name = "Gama";
private long[] feathere = {1,2,3,4,5,6,7,8,9};

private boolean canfly = true;
private int maxSpeed = 34;
public Duck(){

System.out.println("Type 1 duck ");
}
public Duck(boolean fly){
canfly = fly;
System.out.println("Type 2 duck ");

}
public Duck(String n,long[] f){
name = n;
feathere = f;
System.out.println("Type 3 duck ");
}
public Duck(int w , float f){
kilos = w;
floatability = f;
System.out.println("Type 4 duck ");
}
public Duck(float d , int m){
floatability = d;
maxSpeed = m;
System.out.println("Type 5 duck ");
}


}