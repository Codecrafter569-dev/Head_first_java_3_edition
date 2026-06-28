import java.util.Scanner;
public class DrivingLinces{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("enter your age");
int age = sc.nextInt();
if (age>=18){
System.out.println("you can take a driving linces");
}else if (age <=3){
System.out.println("you are a child,you cannot get a driving linces");
}else{
System.out.println("you can't get a driving linces because you are not 18+");
}
}
}