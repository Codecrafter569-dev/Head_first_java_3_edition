import java.util.Scanner;
public class OddSum{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number to calculate the sum of odd number :");
int x = sc.nextInt();
int sum =0;
for(int i =1; i<=x; i++){
if(!(i%2 == 0)){
sum =sum + i;// sum = sum +i;
}
}
System.out.println("sum of odd number is :"+sum);
}
}