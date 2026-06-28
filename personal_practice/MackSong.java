import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class MackSong{
public static void main(String args[]){
JackBox a = new JackBox();
List<String> songs = a.getList();
System.out.println(songs);
Collections.sort(songs);
System.out.println(songs);
}

}
class JackBox{
public static List<String> getList(){
List<String> songs = new ArrayList<>();
songs.add("kide me");
songs.add("Sonth tuni");
songs.add("cakiaano");
songs.add("tukita");
songs.add("$40 ways");
songs.add("30 count");
songs.add("janudsu");
return songs;
}

}