class Dog {
int size;
String name;
 
void bark(){
if(size > 60){
System.out.println("Woof ! woof woof ");
}else if ( size > 14){
System.out.println("ruf ruf ruf !!");
}else {
System.out.println("yio yoi ggeee");
}
}
}




public class DogTestDrive{
public static void main(String args[]){
Dog one = new Dog();
one.size = 70;
Dog two = new Dog();
two.size = 8;
Dog three = new Dog();
three.size = 56;
one.bark();
two.bark();
three.bark();
}
}