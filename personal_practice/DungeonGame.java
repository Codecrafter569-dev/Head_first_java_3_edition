import java.io.*;
public class DungeonGame{
public static void main(String args[]){
DungeonGames d = new DungeonGames();
System.out.println(d.getX()+d.getY()+d.getZ());
try{
FileOutputStream fos = new FileOutputStream("ds.ser");
ObjectOutputStream ops = new ObjectOutputStream(fos);
ops.writeObject(d);
ops.close();

FileInputStream ios = new FileInputStream("ds.ser");
ObjectInputStream ips = new ObjectInputStream(ios);
d = (DungeonGames)ips.readObject();	
ips.close();
}catch(Exception e){
System.out.println(e);	
}
System.out.println(d.getX()+d.getY()+d.getZ());
}
}
class DungeonGames implements Serializable{
public int x = 3;
transient long y = 4;
private short z = 5;
int getZ(){
return z;
}	
int getX(){
return x;
}
long getY(){
return y;
}	
}