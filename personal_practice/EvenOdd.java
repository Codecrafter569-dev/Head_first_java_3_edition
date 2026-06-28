import java.util.Scanner;
public class EvenOdd{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter number :");
int x = sc.nextInt();
if (x % 2 == 0){
System.out.println("you are enter even number");
}else{
System.out.println("you are enter odd number");
}
}
}