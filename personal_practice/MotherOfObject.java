public class MotherOfObject{
public static void main(String args[]){
Cat cat = new Cat();
Cat cat1 = cat ;
Dog dog = new Dog();
if(cat.equals(cat1)){
    System.out.println("true");
}else{
    System.out.println("false");
}
System.out.println(dog.getClass()+" "+cat.getClass());
System.out.println(dog.toString()+" "+cat.toString());
System.out.println(dog.hashCode()+" "+cat.hashCode());

}
}
class Cat{



}

class Dog{



}