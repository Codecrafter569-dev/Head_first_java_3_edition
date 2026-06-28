public class Trangle{
double area;
int hight;
int length;
public static void main(String args[]){
int x = 0;
Trangle[] ta = new Trangle[4];
while (x<4){
ta[x] = new Trangle();
ta[x].hight = (x+1)*2;
ta[x].length = x+4;
ta[x].setArea();
System.out.println("trangle "+x+",area = "+ta[x].area);
x++;
}
int y =x;
x = 27;
Trangle t5 = ta[2];
ta[2].area =567;
System.out.println("y = " +y +",t5 area ="+t5.area);
}
void setArea(){
area = hight * length /2;
}
}