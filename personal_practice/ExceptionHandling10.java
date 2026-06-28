import java.io.*;
public class ExceptionHandling10{

public static void main(String args[]){
try(BufferedReader reader = new BufferedReader(new FileReader("file.txt"))){
	
System.out.println(reader.readLine());	
}catch(IOException e){
	
System.out.println("An error occurred while reading the file .");	
}
}

}