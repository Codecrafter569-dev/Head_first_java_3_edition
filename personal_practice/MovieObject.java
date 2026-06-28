 class Movie{
String title;
String genre;
int rating;
void playIt(){
System.out.println("Playing the movie :"+this.title);
}

}
public class MovieObject{
public static void main(String args[]){
Movie movie1 =new Movie();
movie1.title ="Gone with the Stack";
movie1.genre = "Tragic ";
movie1.rating = 45;
movie1.playIt();
Movie movie2 = new Movie();
movie2.title = "Stack it to";
movie2.genre = "Action";
movie2.rating =4;
movie2.playIt();
}
}