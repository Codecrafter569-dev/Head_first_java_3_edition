import java.io.*;

public class ExceptionHandling6{
public static void main(String args[]){
try{
	readFile();
	
}catch(IOException e){
	System.out.println("File not found !"+e);
	
}

}
public static void readFile() throws IOException{
FileReader file = new FileReader("nonexistentfil.txt");
file.read();	
	
}

}