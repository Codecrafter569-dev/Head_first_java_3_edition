import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;

public class MiniMIDImusic{
public static void main(String args[]){
MiniMIDImusic m = new MiniMIDImusic();
m.play();
}
public void play(){
	try{
		Sequencer player = MidiSystem.getSequencer();
		player.open();
		Sequence sqe = new Sequence(Sequence.PPQ,4);
		Track track = sqe.createTrack();
		
		//message for midiEvent
		ShortMessage msg1 = new ShortMessage();
		msg1.setMessage(NOTE_ON,1,44,100);
		MidiEvent noteOn = new MidiEvent(msg1,1);
		track.add(noteOn);
		
		ShortMessage msg2 = new ShortMessage();
		msg2.setMessage(NOTE_ON,1,44,100);
		MidiEvent noteOff = new MidiEvent(msg2,1);
		track.add(noteOff);
		player.setSequence(sqe);
		player.start();
		
	}catch(Exception e){
		
		System.out.println(e);
	}
	
}
}