public class TestFinal{
final int VALUE_X = 34;//final means -> ones assign value you can't change .
final static int VALUE_Y;
final  int VALUE_Z;
static {
VALUE_Y = 56;
}
public TestFinal(int a){
VALUE_Z = a;

}
public static void main(String args[]){
TestFinal tf = new TestFinal(456);


System.out.println(tf.VALUE_X+ " "+tf.VALUE_Y+ " "+tf.VALUE_Z);



}

}