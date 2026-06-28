public class TestBox{
private Integer i ;
private int j;
  public static void main(String args[]){
TestBox a = new TestBox();
a.go();

  }
public void go(){
i = j;
System.out.println(j);
System.out.println(i);
j = Integer.valueOf(i);

System.out.println(j);
System.out.println(i);
}

}