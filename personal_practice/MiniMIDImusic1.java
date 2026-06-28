import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;
public class MiniMIDImusic1{
public static void main(String args[]){
MiniMIDImusic1 mini = new MiniMIDImusic1();
if(args.length < 2){
System.out.println("Don't forget the instument and note args");	

	
}else{
int instument = Integer.parseInt(args[0]);	
	int note = Integer.parseInt(args[1]);
	mini.play(instument,note);
}
}
public void play(int instument , int note){
	try{
	Sequencer sequencer = MidiSystem.getSequencer();
sequencer.open();
Sequence sqs = new Sequence(Sequence.PPQ,4);	
Track track = sqs.createTrack();

ShortMessage mg1 = new ShortMessage();
mg1.setMessage(PROGRAM_CHANGE,1,instument,0);
MidiEvent changeinstument =  new MidiEvent(mg1,1);		
track.add(changeinstument);

ShortMessage mg2 = new ShortMessage();
mg2.setMessage(NOTE_ON,1,note,100);
MidiEvent noteon =  new MidiEvent(mg2,1);		
track.add(noteon);

ShortMessage mg3 = new ShortMessage();
mg3.setMessage(NOTE_OFF,1,note,100);
MidiEvent noteoff =  new MidiEvent(mg3,16);		
track.add(noteoff);

sequencer.setSequence(sqs);
sequencer.start();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
}
}
