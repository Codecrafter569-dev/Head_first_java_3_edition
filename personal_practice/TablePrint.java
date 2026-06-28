import java.util.Scanner;

public class TablePrint{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter your number to print table of number :");
int n = sc.nextInt();
for(int i = 1; i<=n;i++){
System.out.println("*** Table of a :"+i+" ***");
for(int j = 1;j<=10;j++){
System.out.println(i+"x"+j+"="+" "+i*j);
}
}
}
}