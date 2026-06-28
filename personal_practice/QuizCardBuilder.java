import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
public class QuizCardBuilder{
private ArrayList<QuizCard> cardList = new ArrayList<>();
private JTextArea question;
private JTextArea answer;
private JFrame frame;
public static void main(String args[]){
new QuizCardBuilder().go();	
}
public void go(){
frame = new JFrame("Quiz Card Builder");
JPanel mainpanel = new JPanel();
mainpanel.setLayout(new BoxLayout(mainpanel,BoxLayout.Y_AXIS));
Font bidFont = new Font("serif",Font.BOLD,24);

question = createTextArea(bidFont);
JScrollPane qScroller = createScroller(question);
answer = createTextArea(bidFont);
JScrollPane aScroller = createScroller(answer);

mainpanel.add(new JLabel("Question:"));
mainpanel.add(qScroller);
mainpanel.add(new JLabel("Answer:"));
mainpanel.add(aScroller);

JButton nextButton = new JButton("Next Card");
nextButton.addActionListener(e -> nextCard());
mainpanel.add(nextButton);

JMenuBar menuBar = new JMenuBar();
JMenu fileMenu = new JMenu("File");	

JMenuItem newMenuItem = new JMenuItem("New");
newMenuItem.addActionListener(e -> clearAll());

JMenuItem saveMenuItem = new JMenuItem("Save");
saveMenuItem.addActionListener(e -> saveCard());


fileMenu.add(newMenuItem);
fileMenu.add(saveMenuItem);
menuBar.add(fileMenu);
frame.setJMenuBar(menuBar);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(BorderLayout.CENTER,mainpanel);
frame.setSize(500,600);
frame.setVisible(true);
}
private JScrollPane createScroller(JTextArea textArea){
JScrollPane scroller = new JScrollPane(textArea);
scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);	
scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
return scroller;
}
private JTextArea createTextArea(Font font){
JTextArea textArea = new JTextArea();
textArea.setLineWrap(true);
textArea.setWrapStyleWord(true);
textArea.setFont(font);
return textArea;	
}
private void nextCard(){
	QuizCard card = new QuizCard(question.getText(),answer.getText());
	cardList.add(card);
	clearCard();
}
private void saveCard(){
QuizCard card = new QuizCard(question.getText(),answer.getText());
cardList.add(card);	

JFileChooser filesave = new JFileChooser();
filesave.showSaveDialog(frame);
saveFile(filesave.getSelectedFile());
}

private void clearAll(){
cardList.clear();
clearCard();	
	
}
private void clearCard(){
question.setText("");
answer.setText("");
question.requestFocus();	
}

private void saveFile(File file){
	try{
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		for(QuizCard card : cardList){
		writer.write(card.getQuestion() + "/");
        writer.write(card.getAnswer() +"\n");		
		}
		writer.close();
		
	}catch(IOException e){
	System.out.println("Couldn't wrie the cardList out :"+e.getMessage());	
		
	}
	
}
}


class QuizCard{
private	String question;
private	String answer;
public QuizCard(String q , String a){
question = q;
answer = a;

}	
public String getAnswer(){

return answer;
}
public String getQuestion(){

return question;
}	
}