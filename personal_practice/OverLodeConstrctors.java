public class OverLodeConstrctors{

public static void main(String args[]){
Mushroom m = new Mushroom("giguta");
m.go();
}

}
class Mushroom{
private int size;
private String name;
public Mushroom(){
size = 12;
name = "mushroom";

}
public Mushroom(int s){
size = s;
name = "ushroom";
}
public Mushroom(String n){
name = n;
size = 12;
}
public Mushroom(int s,String n){

size = s;
name = n;
}
public Mushroom(String n, int s){
name = n;
size = s;

}
public void go(){
System.out.println("Mushroom name is :"+name);
System.out.println("Mushroom size is :"+size);

}

}