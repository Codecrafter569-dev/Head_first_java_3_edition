class StaticSuper{
static{
System.out.println("super static block ");

}
public StaticSuper(){
System.out.println("super constructor");
}


}




public class StaticTest2 extends StaticSuper{
static int rand;
static{
rand = (int)(Math.random()*10);
System.out.println("static block "+rand);
}
public static void main(String args[]){
System.out.println("in main");
StaticTest2 a = new StaticTest2();
}
StaticTest2(){
System.out.println("main constrctors");

}

}