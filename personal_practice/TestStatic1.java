public class TestStatic1{
public static void main(String args[]){
Duck.go();
}

}
class Duck{

private int size;
private static int duckCount = 0;
public Duck(){
duckCount++;
}
public int  getSize(){

return size;
}
public void setSize(int size){
this.size = size;

}
public static void go(){
Duck a = new Duck();
a.setSize(1234);
Duck b = new Duck();
b.setSize(12);
Duck c = new Duck();
c.setSize(45);
System.out.println(a.getSize());
System.out.println(Duck.duckCount);   //you can use instance but this is not good ,because this 
                                     //is not readable.you can do that compiler does not throw any eror but this is not true.
System.out.println(c.getSize());
System.out.println(Duck.duckCount);
System.out.println(b.getSize());
System.out.println(Duck.duckCount);
}

}