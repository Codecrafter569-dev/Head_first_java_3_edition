public class ClassAndObject{
public static void main(String args[]){
Dog dog = new Dog();
dog.setAge(12);
dog.setSize(45);
dog.setName("tommy");
System.out.println(dog.getSize());
System.out.println(dog.getAge());
System.out.println(dog.getName());

Dog dog1 = new Dog();
dog1.setAge(4);
dog1.setSize(34);
dog1.setName("kiko");
System.out.println(dog1.getSize());
System.out.println(dog1.getAge());
System.out.println(dog1.getName());
}
}

//incapsution.
 class Dog{
 private int size;
 private String name;
 private int age;
public void setSize(int size){
this.size =size;
}
public void setName(String name){
this.name= name;
}
public void setAge(int age){
this.age =age;
}
public int getAge(){
return age;
}
public int getSize(){
return size;
}
public String getName(){

return name;
}

}
