public class Mixed4{
public static void main(String args[]){
Lion l = new Lion();
Cat c = new Cat();
Animal a = new Animal();
l.lionSize();
c.catSize();
a.lionSize();
a.catSize();
l.waightLion();
c.waightCat();
}
}
class Animal{
String name ="animals";
int list = 2;
int catSize = 20;
int lionSize = 100;
int waightLion = 150;
int waightCat = 6;
public void printName(){
System.out.println(name);

}
public void catSize(){
System.out.println("I am a very lagy cat from Animal *** and my size is :"+catSize);
}
public void lionSize(){
System.out.println("I am a very strong lion from Animal ***  and my size is :"+lionSize);
}

}






class Lion extends Animal{
public void waightLion(){
System.out.println("I am a lion this my waight :"+waightLion);
}
public void lionSize(){
System.out.println("I am a very strong and my size is :"+lionSize);
}

}

class Cat extends Animal{
public void waightCat(){
System.out.println("I am a cat this my waight :"+waightCat);
}
public void catSize(){
System.out.println("I am a very lagy cat and my size is :"+catSize);
}

}

