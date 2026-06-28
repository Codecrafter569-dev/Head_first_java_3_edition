import java.io.*;

public class FileWriter_Test{

  public static void main(String args[]){
  try{
	 File file = new File("testsavefile.txt"); 
	 FileWriter writer = new FileWriter(file);
	 writer.write("this is a file saver method !!!");
	 writer.close();
	 
	 
  }catch(IOException e){
	 System.out.println(e); 
  }
  
  }
}