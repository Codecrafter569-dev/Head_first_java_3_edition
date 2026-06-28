import javax.sound.midi.*;

public class  ExceptionHandling2{
public static void main(String args[]){
MidiTest c =  new MidiTest();
c.go();
}

}
class MidiTest{
public void go(){
try{	
Sequencer sequncer = MidiSystem.getSequencer();
System.out.println("Successfully got a sequncer");
}catch(Exception e){
System.out.println(e);	
}

}	
	
}