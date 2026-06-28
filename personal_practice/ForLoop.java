public class ForLoop{
public static void main(String args[]){
int x = 0;
int y = 30;
for (int i =0; i <3;i++){     //0 30 ,
   for (int j= 4; j>1;j--){
System.out.println(x +" "+y);
x += 5;
y -=2;
if(x == 6){
break;
}
x +=3;
}
y -= 2;
}
System.out.println(x +" "+y);

}
}