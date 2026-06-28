public class StreamingSong{
public static void main(String args[]){
Song song = new Song();
song.artist ="The Beatlas";
song.title ="Come together";
song.play();
song.printDetails();

}
}
class Song{
String title;
String artist;
int duration;
void play(){
System.out.println("Playing song");
}
void printDetails(){
System.out.println("This is "+title+" by "+artist);
}
}