public class TestDuck1_1{
public static void main(String args[]){
HippoBaby hb = new HippoBaby(3423);
System.out.println(hb.getSize());
System.out.println(hb.getSquar());
}
}
class Animal{
private int size;
private int squar;
public Animal(int s){
this(s , s);
size = s;


System.out.println(" Making a Animal ");


}
public Animal(int a , int b){
squar = a*b;

}
public int getSquar(){
return squar;
}
public int  getSize(){
return size;
}

}
class Hippo extends Animal{
public Hippo(int size){
super(size);
System.out.println(" Making a Hippo ");
}


}
class HippoBaby extends Hippo{


public HippoBaby(int size){
super(size);
System.out.println(" Making a HippoBaby ");

}

}