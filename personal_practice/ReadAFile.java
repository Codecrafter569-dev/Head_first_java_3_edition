import java.io.*;
public class ReadAFile{
public static void main(String args[]){
new ReadAFile().go();
}
public void go(){
	String[] str = {" kiriando taka taka "," Lost sankhy "," shawdo colne "," kikiaro "," Migocho "," kakasi "," Hatake"};
	try{
		
		File file1  = new File("testsavefile1.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
		for (String st : str){
		writer.write(st);
		}
		writer.close();
		
		FileReader read = new FileReader(file1);
		BufferedReader reader = new BufferedReader(read);
		String line;
		while((line = reader.readLine()) != null){
			System.out.println(line);
		}
		reader.close();
	}catch(IOException e){

    System.out.println(e);
	}		
}
}