
import java.io.*;
public class TestFileObject{
public static void main(String args[]){
new TestFileObject().go();
}
public void go(){
File f = new File("Mycode.txt");
File dir = new File("Dicateater");
dir.mkdir();
if(dir.isDirectory()){
String[] dirs = dir.list();
for(String dirCon : dirs){
System.out.println(dirCon);
}	
}
boolean isDeleted = f.delete();
}
}