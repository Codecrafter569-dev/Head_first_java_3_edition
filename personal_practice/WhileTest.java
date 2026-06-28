import java.util.Scanner;
public class WhileTest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number between 0 to 6");
int x = sc.nextInt();
int v = 0;
int y = 0;
while(v<5){
if(x == 1){
y=v-y;
}else if(x==2){
y=y+v;
}else if(x==3){
y=y+2;
if(y>4){
y=y-1;
}
}else if (x==4){
v=v+1;
y=y+v;
}else if(x ==5){
if(y<5){
v=v+1;
if(y<3){
v=v-1;
}
}
y=y+2;
}else{
System.out.println("enter rong number,please enter number between 0 to 6 only !!!");
WhileTest.main(args);
break;
}

System.out.print(v+""+y+" ");
v++;
}

}
}