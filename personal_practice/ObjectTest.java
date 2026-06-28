public class ObjectTest{
int id;
String name;
public static void main(String args[]){
ObjectTest ot = new ObjectTest();
System.out.println("I'm a default value of object "+ot.id);
System.out.println("I'm a default value of object "+ot.name);

int[] n =ot.go(67,"vikash");
System.out.println(n[2]);
}
 int[] go(int id,String name){
ObjectTest ot = new ObjectTest();
if(id == 0 || name == null){
System.out.println(" you are call this mathed ");
}else if ( id >30){
ot.id = id;
ot.name = name;
id *= 5;
System.out.println(id+"this is a class id "+ot.id);
}
int[] aff = {45,67,5,262,26};
return aff;
}

}