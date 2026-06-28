public class PoorDog{
public static void main(String args[]){
Poor p = new Poor();
System.out.println("this is a dog size :"+p.getSize());
System.out.println("this is a dog name :"+p.getName());
}
}
class Poor{
private int size;
private String name;
public int getSize(){

return size;
}
public String getName(){
return name;
}
}