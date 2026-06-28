public class TestInterface{
public static void main(String args[]){
System.out.println("if you want to create a interface");
Dalta[] dalta = new Dalta[2];
dalta[0] = new Alpha();
dalta[1] = new Gama();
for(int i = 0; i < dalta.length;i++){
dalta[i].daltaKey();
dalta[0].daltaType();
dalta[i].daltaMouse();

}
Alpha a = new Alpha();
a.Type1();
a.Move();
Gama g = new Gama();
g.Move();
g.Type1();

}

}

 abstract class Dalta{
public abstract void daltaKey();
public abstract void daltaType();
public void daltaMouse(){
 int i = 0;
System.out.println("dalta mouse you can move anything "+i++);

}

}


class Alpha extends Dalta implements Fook{
public  void daltaKey(){
System.out.println("Alpha extends Dalta this is a method of daltaKey");
}
public  void daltaType(){
System.out.println("Alpha extends Dalta this is a method of daltaType");
}
public void Type1(){
System.out.println("interface");
}
public void Move(){
System.out.println("interface");
}

}



class Gama extends Alpha implements Fook{
public  void daltaKey(){
System.out.println("Gama IS-A Alpha this is a method of daltaKey");
this.daltaMouse();
}
public  void Type1(){
System.out.println("interface");
}
public void Move(){
System.out.println("interface");
// super ->we are calling superclass Methods 
super.daltaMouse();
}

}

public interface Fook{
public abstract void Type1();
public abstract void Move();

}