public class CalSum{
public static void main(String args[]){
Cal c = new Cal();
c.setSum(45,56);
System.out.println("The sum of a and b is :"+c.getSum());
}
}
class Cal{
private int sum;
public int getSum(){
return sum;
}
public void setSum(int a,int b){
sum = a+b;
}
}