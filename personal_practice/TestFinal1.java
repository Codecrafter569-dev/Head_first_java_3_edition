public class TestFinal1{
public static void main(String args[]){
Foo f = new Foo();
f.go();
}

}
final class Foo{ //final class means can't extends. 
public final void go(){//final method means can't ovreading .
System.out.println("hello");
}


}