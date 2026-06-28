import java.util.Random;
public class MonsterTestDrive{
private static  Random r = new Random();
public static void main(String args[]){
Monster m[] = new Monster[3];
m[0] = new Vampire();
m[1] = new Dragon();
m[2] = new Monster();
for (int i = 0 ; i< 3 ; i++){
System.out.println(m[i].frighten(i +34));
System.out.println(r.nextInt(51));
}
}

}

class Monster{
boolean frighten(int d ){
System.out.println("arragggggg");
return true;

}

}



class Vampire extends Monster{
boolean frighten(int x ){
System.out.println(" a batie :");
return true;

}


}

class Dragon extends Monster{
boolean frighten(int degree){
System.out.println("breather fire and wallcano : ");
return true;

}


}