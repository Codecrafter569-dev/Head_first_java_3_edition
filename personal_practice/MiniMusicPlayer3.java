import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.sound.midi.ShortMessage.*;

public class MiniMusicPlayer3{
	private MyDrawPanle panle;
	private Random random = new Random();
public static void main(String args[]){
	MiniMusicPlayer3 gui = new MiniMusicPlayer3();
	gui.go();
}
public void setUpGui(){
JFrame frame = new JFrame("My first music video");
panle = new MyDrawPanle();
frame.setContentPane(panle);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setBounds(30,30,300,300);
frame.setVisible(true);
	
}
public void go(){
setUpGui();
try{
Sequencer sequncer = MidiSystem.getSequencer();
sequncer.open();
sequncer.addControllerEventListener(panle,new int[]{127});
Sequence seq = new Sequence(Sequence.PPQ,4);
Track track = seq.createTrack();
int note;
for(int i = 0; i < 60 ; i += 4){
note = random.nextInt(50)+1;	
track.add(makeEvent(NOTE_ON,1,note,100,i));
track.add(makeEvent(CONTROL_CHANGE,1,127,0,i));
track.add(makeEvent(NOTE_OFF,1,note,100,i+2));
}
sequncer.setSequence(seq);
sequncer.start();
sequncer.setTempoInBPM(120);

}catch(Exception e){
System.out.println(e);
}	
}
public static MidiEvent makeEvent(int cmd, int chn1,int one ,int two,int tick){
MidiEvent event = null;
try{
ShortMessage mgs= new ShortMessage();
mgs.setMessage(cmd,chn1,one,two);
event = new MidiEvent(mgs,tick);
}catch(Exception e){
System.out.println(e);
}	
return event;
}
class MyDrawPanle extends JPanel implements ControllerEventListener {
	private boolean msg = false;
	public void controlChange(ShortMessage event){
		msg = true;
		repaint();
	}
	public void paintComponent(Graphics g){
		if(msg){
		int r = random.nextInt(250);
        int gr = random.nextInt(250);
        int b = random.nextInt(250);	
		g.setColor(new Color(r,gr,b));
		int height = random.nextInt(120)+10;
		int width = random.nextInt(120)+10;
		
		int xPos = random.nextInt(40)+10;
		int yPos = random.nextInt(40)+10;
		g.fillRect(xPos,yPos,width,height);
		msg = false;
		
			
		}
	}
	
}
}
