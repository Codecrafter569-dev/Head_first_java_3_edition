import java.lang.Object;
public class Object1{
public static void main(String args[]){

Object1 a = new Object1();
a.go(a);
}
public void go(Object1 a){
Object sameObject1 = getObject(a);
System.out.println(sameObject1.getClass());

}
public static Object getObject(Object o){

return o;
}

}