public class DogArry{
public static void main (String args[]){
Dog[] arr = new Dog[8];
for(int i =0;i<8;i++){
arr[i] = new Dog();
arr[i].setSize((int)(Math.random()*100));
System.out.println("this is a dog size : "+arr[i].getSize());
}
}
}
class Dog{
private int size;
public void setSize(int r){
size = r;
}
public int getSize(){
return size;
}
}