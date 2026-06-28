public class PhraseOMatic{
public static void main(String args[]){
//make three sets of words to choose from.
String[] wordListOne ={"agnostic","Fido","voic activated","hoptically","extensible","reactive","agent based ","function","AI enabled","Strong type"};
String[] wordListTwo = {"loosely","Six sigma","asynchronous","Event drive","pub-sub","IoT","clodnative","Service oriented","containertzed","Serverless","microservices","distrbuted"};
String[] wordListThree= {"framework","Library","DSL","Rest ApI","repository","pipeLine","Design","orientation"};
//find out how many words are in each list.
int ol = wordListOne.length;
int tl = wordListTwo.length;
int thl = wordListThree.length;

//generate three random numbers.
java.util.Random rg = new java.util.Random();
int ran1 = rg.nextInt(ol);
int ran2 =rg.nextInt(tl);
int ran3 = rg.nextInt(thl);
//new Build a prase.
String phrase = wordListOne[ran1]+" "+wordListTwo[ran2]+" "+wordListThree[ran3];

System.out.println("what we need is a "+phrase);
}


}