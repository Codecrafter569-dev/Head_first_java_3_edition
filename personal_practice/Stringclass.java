public class Stringclass{
public static void main(String args[]){
//concatenation
String name = new String("vikash");
String name2 = new String("kumar");
String sentance = name+name2;
System.out.println(sentance);
name = "shile";
sentance = name+name2;
System.out.println(sentance+"\n this is a last index of name :  "+name.charAt(4)
+"\n this is a length of a sentance : "+sentance.length()
+"\n  we can replace : "+sentance.replace('s','k')+"\n we can use subString : "+sentance.substring(4,4)+ sentance);
}
}