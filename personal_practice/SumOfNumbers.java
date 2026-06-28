import java.util.Scanner;
public class SumOfNumbers{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number to calculate the sum of  numbers :");
int x = sc.nextInt();
int sum =0;
for(int i =1; i<=x; i++){
sum += i;// sum =sum + i;

}
System.out.println("sum of  numbers is :"+sum);
}
}