import java.util.Scanner;
public class StudentMarks{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println(" enter your Math marks :");
int a = sc.nextInt();
System.out.println("enter your science marks :");
int b = sc.nextInt();
System.out.println("enter your English marks :");
int c = sc.nextInt();
System.out.println("enter your Hindi marks :");
int d = sc.nextInt();
System.out.println("enter your s.s.t marks :");
int e = sc.nextInt();
double sum =(a+b+c+d+e)/5;
System.out.println("avarage of all subject marks : "+sum);
}
}