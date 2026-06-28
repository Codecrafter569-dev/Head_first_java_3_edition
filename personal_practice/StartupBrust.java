                    
import java.util.*;
import java.util.ArrayList;


public class StartupBrust{

private GameHelper helper = new GameHelper();
private ArrayList<Startup> startups = new ArrayList<Startup>();
private int numofGuesses = 0;

private void setupGame(){
Startup one = new Startup();
one.setName("poniez");
Startup two = new Startup();
two.setName("hacqi");
Startup three = new Startup();
three.setName("cabista");
startups.add(one);
startups.add(two);
startups.add(three); 

System.out.println("your goal is to sink three Statups");
System.out.println("poniez,cabista,hacqi");
System.out.println("try to sink them all in the fewest number of guesses");
for(Startup startup : startups){
ArrayList<String> newLocation = helper.placeStartup(3);
startup.setLocationCells(newLocation);
}
}
private void startPlaying(){
while (! startups.isEmpty()){
String userGuess = helper.getuserInput("Enter a Guess");
checkuserGuess(userGuess);

}
finishGame();
}

private void checkuserGuess(String userGuess){
numofGuesses++;
String result = "miss";

for (Startup startupToTest : startups ){
result = startupToTest.chechyourSelf(userGuess);

if (result.equals("hit")){
break;
}

if (result.equals("kill")){
startups.remove(startupToTest);
break;
}
}
System.out.println(result); 
}
private void finishGame(){
System.out.println("All startups are dead ! your stock is now  worthless");
if(numofGuesses <= 18 ){
System.out.println("It only took you"+numofGuesses+"Guesses");
System.out.println("you get out before your options sank.");
}else{
System.out.println("took you long enough."+numofGuesses+"guesses");
System.out.println("Fish are dancing with your options");
}
}

public static void main(String args[]){
StartupBrust game = new  StartupBrust();
game.setupGame();
game.startPlaying();
}
}

class Startup{
private ArrayList<String>  locationCells;
private String name;

public void setLocationCells(ArrayList<String> loc){
locationCells = loc;
}

public void setName(String n){
name = n;
}
public String chechyourSelf(String userInput){
String result = "miss";
int index = locationCells.indexOf(userInput);
if(index >= 0){
locationCells.remove(index);

if(locationCells.isEmpty()){
result ="kill";
System.out.println("Ouch ! you sunk  "+name+"**");
}else{
result = "hit";
}
}
return result ;
}

}




class GameHelper{
private static final String ALPHABET = "abcdefg";
private static final int GRID_LENGTH = 7;
private static final int GRID_SIZE = 49;
private static final int MAX_ATTEMPTS  = 200;
static final int HORIZONTAL_INCREMENT = 1;
static final int VERTICAL_INCREMENT = GRID_LENGTH ;

private final int[] grid = new int[GRID_SIZE];
private final Random random = new Random();
private int startupCount  = 0;

public String getuserInput(String prompt){
System.out.print(prompt+ ": ");
Scanner sc = new Scanner(System.in);
return sc.nextLine().toLowerCase();

}

public ArrayList<String>  placeStartup(int startupSize){
int[] startupCoords = new int[startupSize];
int attempts = 0;
boolean success = false;


startupCount++;
int increment = getIncrement();

while ( ! success & attempts++ < MAX_ATTEMPTS){
int location = random.nextInt(GRID_SIZE);
for (int i =0 ;i < startupCoords.length; i++){
startupCoords[i] =location ;
location +=  increment;
}
if (StartupFits(startupCoords ,increment) ){
success  = coordsAvailable(startupCoords);
}
}
savePostionToGrid(startupCoords);
ArrayList<String> alphaCells = convertCoordsToAlphaFormat(startupCoords);

return alphaCells;
}

private boolean StartupFits(int[] startupCoords  , int increment){
int finalLocation = startupCoords[startupCoords.length - 1];

if (increment == HORIZONTAL_INCREMENT ){
return calcRowFromIndex(startupCoords[0]) == calcRowFromIndex(finalLocation);
}else {
return finalLocation < GRID_SIZE ;
}
}
private boolean coordsAvailable(int[] startupCoords){
for(int coord : startupCoords ){
if(grid[coord] != 0){

return false;
}
}  
return true;

}
private void savePostionToGrid(int[] startupCoords ){
for(int index : startupCoords){
grid[index] = 1;
}
}

private ArrayList<String> convertCoordsToAlphaFormat(int[] startupCoords){

ArrayList<String> alphaCells = new ArrayList<String>();
for (int index : startupCoords ){
String alphaCoords = getAlphaCoordFromIndex(index);
alphaCells.add(alphaCoords);
}
return alphaCells;
}

private String getAlphaCoordFromIndex(int index){
int row = calcRowFromIndex(index);
int colum = index % GRID_LENGTH;
String letter = ALPHABET.substring(colum ,colum +1);

return letter + row;
}

private int calcRowFromIndex(int index){
return index / GRID_LENGTH;
}

private int getIncrement(){
 if(startupCount  % 2 == 0){
return HORIZONTAL_INCREMENT ;
}else{
return VERTICAL_INCREMENT ;
}
}


}