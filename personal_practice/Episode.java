public class Episode{
public static void main(String args[]){
Episode1 er = new Episode1();
er.sNumber =4;
er.play();
er.skipIntro();
}

}
class Episode1{
int sNumber;
int eNumber;
void skipIntro(){
System.out.println("skipping intro ....");
}
void skipToNext(){
System.out.println("Loading next episode");
}
void play(){
System.out.println("Playing episode "+sNumber);
}
}