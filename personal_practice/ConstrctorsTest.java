public class ConstrctorsTest{
public static void main(String args[]){
Duck a = new Duck(56);
a.setSize(3243);
NewDuck nd = new NewDuck(564);
nd.go();
NewDuck n1 = new NewDuck();
n1.go();
}


}
class Duck{
private int size;
private int hungerBar;
public Duck(int h  ){
hungerBar= h;
System.out.println("My hunger bar is "+hungerBar);
System.out.println("Quack");

}

public void setSize(int newSize){

size = newSize;
}
}

class NewDuck{
private int size;
public NewDuck(){
size = 23;
}
public NewDuck(int s){
size = s;
}


public void go(){
System.out.println("I'm a new duck this is my size "+size);
}




}