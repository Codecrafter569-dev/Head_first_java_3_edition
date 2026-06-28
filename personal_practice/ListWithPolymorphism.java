import java.util.List;
import java.util.ArrayList;
public class ListWithPolymorphism{
 public static void main(String args[]){
List<Animal> animal = List.of(new Cat(),new CatBaby(),new Cat(),new CatBaby(),new Animal());
takeAnimal(animal);
 }
public static void takeAnimal(List<Animal> animal){

for(Animal a  : animal){
a.eat();
}
}
}
  class Animal{
Animal(){
System.out.println("Animal");

}
 void eat(){
System.out.println("animal eating");
 }

}

class Cat extends Animal{
Cat(){
System.out.println("Cat");

}
void eat(){
System.out.println("CAt eating");
 }
}
class CatBaby extends Cat{
CatBaby(){
System.out.println("CatBaby");
}
void eat(){
System.out.println("catBaby eating");
 }

}