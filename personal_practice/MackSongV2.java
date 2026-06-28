import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.lang.Comparable;
public class MackSongV2{
public static void main(String args[]){
new MackSongV2().go();

}
public void go(){
List<JackBox> songs = MackSong.getSongV2();
System.out.println(songs);
Collections.sort(songs);
System.out.println(songs);

}
}

class JackBox implements Comparable<JackBox>{
private String title;
private String artist;
private int bpm;
public int compareTo(JackBox s){
return title.compareTo(s.getTitle());

}
public JackBox(String t , String a , int b){
title = t;
artist = a;
bpm = b;
}
public String getTitle(){

return title;
}
public String getArtist(){

return artist;
}
public int getBpm(){

return bpm;
}
public String toString(){

return title;
}
}

class MackSong{
public static List<JackBox> getSongV2(){
List<JackBox> songs = new ArrayList<>();
songs.add(new JackBox("someresult","rezo",727));
songs.add(new JackBox("cassidy","greatful dade",74384));
songs.add(new JackBox("$10","hitchhati",9393));
songs.add(new JackBox("java Api","kiko",7439));
songs.add(new JackBox("Cassidy","greatFul",7383));
songs.add(new JackBox("50 Ways","sinoga",858));
return songs;
}


}