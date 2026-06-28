interface Nose{
public int iMethod();

}
abstract class Picaso implements Nose{
public int iMethod(){
return 2;
}
}
class Clowns extends Picaso{
}
class Acts extends Picaso{
public int iMethod(){
return 1;
}


}
public class ClassOf76 extends Clowns{
public static void main(String args[]){
Nose[] i = new Nose[3];
i[0] = new Acts();
i[1] = new Clowns();
i[2] = new ClassOf76();
for(int x = 0; x < i.length; x++){
System.out.println(i[x].iMethod() + " " + i[x].getClass());
}

}

}