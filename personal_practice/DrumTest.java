public class DrumTest{
public static void main(String args[]){
DrumKit d = new DrumKit();
d.plays();
d.snare =false;
d.playt();
if(d.snare == true){
d.plays();
}
}

}
class DrumKit{
boolean tophot =true;
boolean snare = true;
void plays(){
System.out.println("bang bang ba-bang");
}
void playt(){
System.out.println("ding ding da-ding");
}
}