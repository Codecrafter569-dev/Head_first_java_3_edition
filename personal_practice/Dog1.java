public class Dog1{
String name ;
public static void main(String args[]){
//make a dog object and acces it
Dog1 dog = new Dog1();
dog.bark();
dog.name = "bob";

//now make a dog array
Dog1[] mydog = new Dog1[3];
mydog[0] = new Dog1();
mydog[1] =new Dog1();
mydog[2] = dog;

mydog[0].name = "freab";
mydog[1].name = "kiko";

System.out.println("last dog name is: "+mydog[2].name);
int x= 0;
while (x < mydog.length){
mydog[x].bark();
x++;
}
}
void bark(){

System.out.println(name+ " says ruff ..");
}
}