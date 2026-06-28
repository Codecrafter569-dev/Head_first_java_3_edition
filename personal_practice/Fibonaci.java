import java.util.Scanner;
public class Fibonaci{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int fio =1;
int t;
int p ;
for (int i =1;i<=n;i++){
t = i-1;
p = i-2;
fio =fio+t+p;

}
System.out.println("this is a fibonacisiqns of :"+n + " "+ fio);
}
}