public class OverLodeMethad{
public static void main(String args[]){
OverLodeMethad lode = new OverLodeMethad();
int a = 0 , b = 56;
long gh = 37636846496367l;
System.out.println(lode.go(a,b,gh));
lode.go();
lode.go(a);
lode.go(a,b);
lode.go(gh);
lode.go(b,gh);

}
//this is all overlode methads we can call it.
public void go(){
System.out.println("hello world");
}
public void go(int a){
System.out.println("hello world");
}
public int go(int a, int b ,long gh){
System.out.println("hello world");
return 1;
}
public void go(int a, int b){
System.out.println("hello world");
}
public void go(long s){
System.out.println("hello world");
}
public void go(int b , long a){
System.out.println("hello world");

}
}