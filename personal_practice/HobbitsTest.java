class Hobbits{
String name;
}

public class HobbitsTest{
public static void main(String args[]){
Hobbits[] h = new Hobbits[3];
int x = -1;
while(x<2){
x++;
h[x] = new Hobbits();
h[x].name = "bilio";
if (x==1){
h[x].name = "frobe";
}
if(x==2){
h[x].name ="holeg";
}
System.out.println(h[x].name + " is a"+ " good hobbit name");
}
}
}