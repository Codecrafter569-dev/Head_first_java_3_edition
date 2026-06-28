public class TestSepretor{
public static void main(String args[]){
new TestSepretor().go();
}
public void go(){
String sentance = "What is blue + yello?/Green";
String[] sentances = sentance.split("/");
for(String se : sentances){
System.out.println(se);	
}
}

}