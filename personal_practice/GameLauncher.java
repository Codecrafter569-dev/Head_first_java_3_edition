import java.util.Scanner;
public class GameLauncher{
public static void main(String args[]){
GuessGame game =new GuessGame();
game.startGame();

}
}

class GuessGame{
Player p1;
Player p2;
Player p3;
public void startGame(){
p1 =new Player();
p2 =new Player();
p3 = new Player();

int guessp1 =0;
int guessp2 = 0;
int guessp3 = 0;

boolean p1isRight = false;
boolean p2isRight = false;
boolean p3isRight = false;

int targetNumber =(int) (Math.random() *10);
System.out.println("I'm thinking of a number between 0 and 9...");


while(true){
p1.guess();
p2.guess();
p3.guess();

guessp1 =p1.number;
System.out.println("Player one guessed "+guessp1);

guessp2 = p2.number;
System.out.println("Player two guessed "+guessp2);

guessp3 = p3.number;
System.out.println("Player three guessed "+guessp3);

if (guessp1 ==targetNumber){
p1isRight = true;
}
if (guessp2 == targetNumber){
p2isRight = true;
}
if (guessp3 == targetNumber){
p3isRight = true;
}

if(p1isRight || p2isRight || p3isRight ){
System.out.println("we have a winner !");
System.out.println("Player one to got Right?"+p1isRight);
System.out.println("Player two to got Right?"+p2isRight);
System.out.println("Player three to got Right?"+p3isRight);
System.out.println("Game over !!");
break;//game over, break out of the loop
}else {
System.out.println("Player will have to try again !!");

}
} 
}
}



class Player {
int number;
public void guess(){
System.out.println("guess any number ");
Scanner sc = new Scanner(System.in);
try {
this.number = sc.nextInt();
}catch(Exception e){
e.printStackTrace();
}
}

}