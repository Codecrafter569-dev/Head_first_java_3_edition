import java.util.List;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Lambda3{
public static void main(String args[]){
List<Song> songs = new Songs().getSong();

List<Song> rockSongs = songs.stream()
                            .filter(song -> song.getGener().contains("Rock"))
                            .collect(Collectors.toList());
System.out.println(rockSongs);

                       songs.stream()
                            .map(song->song.getGener())
                            .distinct()
                            .forEach(System.out::println);

List<String> gener = songs.stream()
                          .map(song -> song.getGener())
                          .distinct()
                          .collect(Collectors.toList());
System.out.println(gener);

List<String> gener1 = songs.stream()
                          .map(song -> song.getGener())
                          .collect(Collectors.toList());
System.out.println(gener1);
String songTitle = "With a Little Help from My Friends";
List<String> gener2 = songs.stream()
                           .filter(song -> song.getTitle().equals(songTitle)) 
                           .map(song -> song.getArtist())
                           .filter(artist -> !artist.equals("The Beatles"))
                           .collect(Collectors.toList());

//we are calling a new method
new StreamPuzzle().go();						   
}

}
class Songs{
public List<Song> getSong(){
return List.of(new Song("$10","Hitchhiker","Electronic",2016,183),
new Song("Havana","Camila cabello", "R&B",2017,323),
new Song("Cassidy","GrateFul Dead","Rock",1933,123),
new Song("50 Ways" ,"Paul Simon", "Soft Rock",1972,199),
new Song("Hurt","Nine Inch Nails","Industrial Rock",1975,257),
new Song("Silence","Delerium","Electronic",1999,134),
new Song("Hurt","Johnny Cash","Soft Rock",2002,392),
new Song("Watercolour","Pendulum","Elecronic",2010,155),
new Song("The Outersider","A Perfact Circle","Alternative Rock",2004,312),
new Song("With  Little Help from My Friends","The Beatles","Rock",1967,47),
new Song("Immigrant Song","Karen o","Industrial Rock",2011,12),
new Song("Breather","The Prodigy","Electronic",1990,336),
new Song("What ' s Going On","Gaya","R&b",1971,420),
new Song("Hallucinate","Dua Lipa","Pop",2019,459),
new Song("I am not a Woman","Halsey","Alternative Rock",2021,384),
new Song("Walk me Home","P!nk","Pop",1999,244),
new Song("Pasos de cero","Pablo Alboran","Latin",2023,117),
new Song("Smooth","Santana","Latin",1214,245),
new Song("Immigrant song", "Led zeppelin","Rock",1970,484));
}
}
class Song{
private final String title;
private final String artist;
private final String gener;
private final int year;
private final int timesPlayed;

public Song(String t , String a, String g, int y , int tp){
title  = t;
artist = a;
gener = g;
year = y;
timesPlayed = tp;
}
public String getTitle(){
return title;
}
public String getArtist(){
return artist;
}
public String getGener(){
return gener;
}
public int getYear(){
return year;
}
public int getTimesPlayed(){
return timesPlayed;
}
public String toString(){

return title;
}
}






 class StreamPuzzle{
public void go(){
SongSearch songSearch = new SongSearch();
songSearch.printTopFiveSongs();	
songSearch.search("The Beatles");
songSearch.search("The Beach Boys");
}


}
class SongSearch{
private final List<Song> songs = new Songs().getSong();	
	void printTopFiveSongs(){
		List<String> topFive = songs.stream()
		                            .sorted(Comparator.comparingInt(Song::getTimesPlayed))
									.map(song ->song.getTitle())
									.limit(5)
									.collect(Collectors.toList());
               System.out.println(topFive);
			   

	}
	void search(String artist){
	Optional<Song> result = songs.stream()
                       .filter(song -> song.getArtist().equals(artist))	
					   .findFirst();
	if(result.isPresent()){
	System.out.println(result.get().getTitle());	
	}else{
	System.out.println("No songs found by: "+artist);	
	}
	
	}
}