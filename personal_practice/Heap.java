public class Heap{
int id =0;
public static void main(String args[]){
int x = 0;
Heap[] hp = new Heap[5];
while(x<3){
hp[x] = new Heap();
hp[x].id =(int)(Math.random()*1000000);
System.out.println("this a object of "+hp[x]+"  "+hp[x].getId());
x++;
}
hp[3] =hp[1];
hp[4] = hp[1];
hp[3] = null;
hp[4] = hp[0];
hp[0] = hp[3];
hp[3] = hp[2];
hp[2] = hp[0];
System.out.println("this a object of "+hp[x]+"  "+hp[x].getId());
}
int  getId(){
return id;
}
}