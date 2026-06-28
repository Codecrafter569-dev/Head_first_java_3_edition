import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class SimpleStartupTest{

public static void main(String args[]){

int numOfGuess = 0;

Scanner sc = new Scanner(System.in);

Startup dot = new Startup();

ArrayList<String> locations = new ArrayList<>();
locations.add("1");
locations.add("2");
locations.add("3");
dot.set(locations);
boolean isAlive = true;
while(isAlive){
System.out.println("enter a number to guess : ");
String guess = sc.nextLine();

String result = dot.check(guess);
numOfGuess++;
if(result.equals("kill")){
isAlive = false;
System.out.println("you took "+numOfGuess+" guesses");
}
}

}
}

class Startup{
private ArrayList<String> locationCells;
private int numOfHits;

public void set(ArrayList<String> l){
locationCells = l;
}

public String check(String guess){
String result = "miss";
int index = locationCells.indexOf(guess);
if (index >= 0){
locationCells.remove(index);
if(locationCells.isEmpty()){
result = "kill";
}else{
result = "hit";
}
}
System.out.println(result);
return result;
}
}