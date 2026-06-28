public class Honey{

public static void main(String args[]){
Honey honeyPot = new Honey();
Honey[] ha = {honeyPot,honeyPot,honeyPot,honeyPot};
Bees bees = new Bees();
Bear[] bear = new Bear[5];
for( int i = 0;i<5 ;i++){
bear[i] = new Bear();
bear[i].hunny = honeyPot;
}
Kit kit  = new Kit();
kit.honey = honeyPot;
Raccoon ra = new Raccoon();
ra.rh = honeyPot;
honeyPot.go();
ra.rk = kit;
kit = null;
}
public void go(){

System.out.println("only honey");
}
}
class Bees{
Honey[] beeHoney;

}
class Raccoon{
Kit rk;
Honey rh;


}
class Kit{
Honey honey;


}
class Bear{
Honey hunny;

}