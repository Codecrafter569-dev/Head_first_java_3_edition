class Eho{
int count =0;
void hello(){
System.out.println("helloooo...");
}
}
public class EhoTest{
public static void main(String args[]){
Eho e1 = new Eho();
Eho e2 = e1;
int i =0;
while(i<4){
e1.hello();
e1.count = e2.count +1;
if(i==3){
e2.count = e2.count +1;
}
if(i>0){
e2.count = e2.count +e1.count;
}
i++;
}
System.out.println(e2.count);
}
}