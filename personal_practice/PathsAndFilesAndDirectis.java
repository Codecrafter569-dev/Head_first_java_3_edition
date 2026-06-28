import java.nio.file.*;
public class PathsAndFilesAndDirectis{
public static void main(String args[]){
new PathsAndFilesAndDirectis().go();
}
public void go(){
try{
	//this is a Object of all files this not achula.
	Path myPath = Paths.get("GangsterCity");
	Path myPath2 = Paths.get("GangsterCity","media");
	Path myPath3 = Paths.get("GangsterCity","source");
	Path myPath4 = Paths.get("GangsterCity","res");
	Path myPath5 = Paths.get("GangsterCity","ip");
	
	//we will be createing files.
	Files.createDirectory(myPath);
	Files.createDirectory(myPath2);
	Files.createDirectory(myPath3);
	Files.createDirectory(myPath4);
	Files.createDirectory(myPath5);
	Files.move(source,myPath3.resolve(source.getFileName()));
	Files.move(myMedia,myPath2.resolve(myMedia.getFileName()));
	
}catch(Exception e){
System.out.println(e);	
}

}

}