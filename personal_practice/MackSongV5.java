import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
public class MackSongV5{
public static void main(String args[]){
new MackSongV5().go();

}
public void go(){
List<JackBox> songs = MackSong.getSongV2();
System.out.println(songs);
Collections.sort(songs);
System.out.println(songs);


Set<JackBox> songSet = new HashSet<>(songs);
System.out.println(songSet);
}
}


class JackBox implements Comparable<JackBox>{
private String title;
private String artist;
private int bpm;
boolean titleTest = false;
boolean artisTest = false;
boolean bpmTest = false;
public boolean equals(Object aSong){
JackBox other = (JackBox)aSong;
return title.equals(other.getTitle());
}
public int hashCode(){
return title.hashCode();
}
public int compareTo(JackBox s){
return title.compareTo(s.getTitle());

}
public JackBox(String t , String a , int b){
title = t;
artist = a;
bpm = b;
}
public String getTitle(){
artisTest = false;
 bpmTest = false;
titleTest = true;
return title;
}
public String getArtist(){
bpmTest = false;
titleTest = false;
artisTest = true;
return artist;
}
public int getBpm(){
titleTest = false;
artisTest = false;
bpmTest =true;
return bpm;
}
public String toString(){
if(titleTest){
return title;
}else if(artisTest){

return artist;
}else if(bpmTest){
return ""+bpm;
}else{
return title;
}

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
songs.add(new JackBox("Cassidy","sinoga",858));
return songs;
}


}