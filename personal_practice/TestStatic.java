public class TestStatic{
static int value;
int value1; 
public static void main(String args[]){
System.out.println("Static contains");
System.out.println(value++);
TestStatic ts = new TestStatic();
ts.go();
}
public void go(){
System.out.println(value1);
System.out.println(value);
TestStatic.go1();
}
public static void go1(){
System.out.println(value);

}

}