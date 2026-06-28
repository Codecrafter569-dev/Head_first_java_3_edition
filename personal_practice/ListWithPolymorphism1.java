import java.util.List;

public class ListWithPolymorphism1{
 public static void main(String args[]){
List<Cat> animal = List.of(new Cat(),new Cat());
ListWithPolymorphism1 th = new ListWithPolymorphism1();
th.takeAnimal(animal);
List<? extends Animal> cats = th.takeCat(animal);
th.takeAnimal(cats);
 }
public  <T extends Animal> void takeAnimal(List<T> animal){

for(Animal a  : animal){
a.eat();
}


}
public List<? extends Animal> takeCat(List<? extends Animal> cat){

return cat;
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