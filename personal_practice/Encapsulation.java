public class Encapsulation{
public static void main (String args[]){
GoodDog dog = new GoodDog();
dog.setSize(78);
GoodDog dog1 = new GoodDog();
dog1.setSize(5);
GoodDog dog2 = new GoodDog();
dog2.setSize(45);
GoodDog dog3 = new GoodDog();
dog3.setSize(77);
dog.bark();
dog1.bark();
dog2.bark();
dog3.bark();
System.out.println("this is  :"+dog.getSize());
System.out.println("this is  :"+dog1.getSize());
System.out.println("this is  :"+dog2.getSize());
System.out.println("this is  :"+dog3.getSize());
}
}
class GoodDog{
private int size;
public void setSize(int i){
size = i;
}
public int getSize(){
return size;
}
void bark(){
if (size > 45){
System.out.println("this is a dog size :"+size);
}else if (size <45){
System.out.println("this is a dog size :"+size);
}else{
System.out.println("this is a dog size :"+size);
}
}
}