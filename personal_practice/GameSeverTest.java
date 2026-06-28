import java.io.*;
import java.util.Arrays;
public class GameSeverTest{

public static void main(String args[]){
GameCharcacter one = new GameCharcacter(50,"Troll",new String[]{"bow","shword","knife"});
GameCharcacter two = new GameCharcacter(5034,"Megician",new String[]{"bow","traident","ax"});
GameCharcacter three = new GameCharcacter(3430,"Elf",new String[]{"piax","bow","invisiblity"});

try{
	ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
	os.writeObject(one);
	os.writeObject(two);
	os.writeObject(three);
	os.close();
	
}catch(IOException ex){
System.out.println(ex);	
}


try{
	ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
	GameCharcacter one1 = (GameCharcacter)is.readObject();
	GameCharcacter two1 = (GameCharcacter)is.readObject();
	GameCharcacter three1 = (GameCharcacter)is.readObject();
	is.close();
	System.out.println(one1.getPower()+" "+one1.getType()+" "+one1.getWeapons());
	System.out.println(two1.getPower()+" "+two1.getType()+" "+two1.getWeapons());
	System.out.println(three1.getPower()+" "+three1.getType()+" "+three1.getWeapons());
	
	
}catch(Exception e){
System.out.println(e);	
}
}
}
class GameCharcacter implements Serializable{
private final int power;
private final String type;
private final String[] weapons;
public GameCharcacter(int power , String type, String[] weapons){
this.power = power;
this.type = type;
this.weapons = weapons;
}	
public int getPower(){
return power;

}
public String getType(){
return type;
}
public String getWeapons(){
return Arrays.toString(weapons);
}	
}