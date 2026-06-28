import java.util.*;
public class ListWithPolymorphism2{
 public static void main(String args[]){
 ListWithPolymorphism2 th = new ListWithPolymorphism2(); 
//this Calling mathods is true
th.takeAnimal(new ArrayList<Animal>());
th.takeDogs(new ArrayList<>());
List<Dog> dogs = new ArrayList<>();
th.takeDogs(dogs);
th.takeSomeAnimal(new ArrayList<Dog>());
th.takeSomeAnimal(new ArrayList<>());
th.takeSomeAnimal(new ArrayList<Animal>());
th.takeObjects(new ArrayList<Object>());
List<Animal> animals = new ArrayList<>();
th.takeSomeAnimal(animals);
/*this is not true
th.takeDogs(new ArrayList<Animal>());
th.takeAnimal(new ArrayList<Dog>());
th.takeObjects(new ArrayList<Dog>());
List<Object> objects = new ArrayList();
th.takeObjects(new ArrayList<Dog>());

*/
 }
private void takeDogs(List<Dog> dogs){

}
private void takeAnimal(List<Animal> animal){

}
private void takeSomeAnimal(List<? extends Animal> animal){

}
private void takeObjects(ArrayList<Object> objects){

}
}
class Animal{


}
class Dog extends Animal{


}