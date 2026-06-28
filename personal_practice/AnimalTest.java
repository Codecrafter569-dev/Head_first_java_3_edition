public class AnimalTest{
public static void main(String args[]){
MyAnimal my = new MyAnimal();
MyDog df = new MyDog();
Animal[] a = new Animal[6];
a[0] = new Dog();
a[1] = new Cat();
a[2] = new Lion();
a[3] = new Tiger();
a[4] = new Wolf();
a[5] = new Hippo();
Dog dfs =(Dog) a[0];
for(int i = 0; i< a.length; i++){
a[i].makeNoise();
a[i].eat();
a[i].sleep();
a[i].roam();
my.add(a[0]);
df.add(dfs);
}

}
}

abstract class Animal{
private int picture = 45*45;
private int food = 100;
private int hunger = 67;
private int boundry = 56+12;
private int xcor = 45;
private int ycor = 67;
private int location =  xcor * ycor ;
public abstract void makeNoise();
public abstract void eat();
public abstract void sleep();
public void roam(){
System.out.println("hippo is roam from Animal");
}


}
abstract class Canline extends Animal{
public abstract void roam();
}
abstract class Feline extends Animal{
public abstract void roam();
}


class Lion extends Feline{
public void makeNoise(){
System.out.println("Lion is make noise");
}
public void roam(){
System.out.println("Lion is roaming ");
}
public void sleep(){
System.out.println("Lion is sleeping");
}
public void eat(){
System.out.println("Lion is eating ");
}
}

class Tiger extends Feline{
public void makeNoise(){
System.out.println("Tiger is make noise ");
}
public void eat(){
System.out.println("Tiger is eating ");
}
public void roam(){
System.out.println("Tiger is roaming");
}
public void sleep(){
System.out.println("Tiger is sleeping");
}

}

class Cat extends Feline{
public void makeNoise(){
System.out.println("Cat is make noise ");
}
public void sleep(){
System.out.println("Cat is sleeping ");
}
public void eat(){
System.out.println("Cat is eating");
}
public void roam(){
System.out.println("Cat is roaming");
}


}


class Wolf extends Canline{
public void makeNoise(){
System.out.println("Walf is make noise");
}
public void eat(){
System.out.println("Walf is eating ");
}
public void roam(){
System.out.println("Walf is roaming");
}
public void sleep(){
System.out.println("Walf is sleeping");
}

}

class Dog extends Canline{
public void makeNoise(){
System.out.println("Dog is make noise");
}
public void eat(){
System.out.println("Dog is eating");
}
public void roam(){
System.out.println("Dog is roaming");
}

public void sleep(){
System.out.println("Dog is sleeping");
}

}
class Hippo extends Animal{
public void makeNoise(){
System.out.println("HiPPo is make noise");
}
public void eat(){
System.out.println("Hippo is eating");
}
public void sleep(){
System.out.println("Hippo is sleeping");
}
}

class MyAnimal{
private Animal[] animal = new Animal[6];
private int nextIndex = 0;
public void add(Animal a ){
if( nextIndex < animal.length ){
animal[nextIndex] = a;
System.out.println("Animal added at " + nextIndex);
nextIndex++;

}
}
}

class MyDog{
private Dog dog[] = new Dog[6];
private int nextIndex = 0;
public void add(Dog a ){
if ( nextIndex < dog.length ){
dog[nextIndex] = a;
System.out.println("Dog is added at "+nextIndex);
}
}
}







