import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.lang.Comparable;
import java.util.Comparator;
public class MackSongV4{
public static void main(String args[]){
new MackSongV4().go();

}
public void go(){
List<JackBox> songs = MackSong.getSongV2();
System.out.println(songs);
Collections.sort(songs);
System.out.println(songs);

//we are use first trick to call compareTo() method with lambda Expraction.

Collections.sort(songs,(one ,two) -> one.getTitle().compareTo(two.getTitle()));
System.out.println(songs);

//we are use second trick to call compareTo() method with lambda Expraction.
songs.sort((one,two) -> one.getArtist().compareTo(two.getArtist()));
System.out.println(songs);

//we are sorting in desending order with lambda Exprestion.
songs.sort((one,two) -> two.getArtist().compareTo(one.getArtist()));
System.out.println(songs);

songs.sort((one ,two) -> one.getBpm()-two.getBpm());
System.out.println(songs);

songs.sort((one ,two) -> two.getBpm()-one.getBpm());
System.out.println(songs);
}
}


class JackBox implements Comparable<JackBox>{
private String title;
private String artist;
private int bpm;
boolean titleTest = false;
boolean artisTest = false;
boolean bpmTest = false;
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
songs.add(new JackBox("50 Ways","sinoga",858));
return songs;
}


}