import java.util.*;
public class SortMuntains{
public static void main(String args[]){
new SortMuntains().go();
}
public void go(){
List<Mountains> moun = new ArrayList<>();
moun.add(new Mountains("Longs",7489));
moun.add(new Mountains("Elbert",72984));
moun.add(new Mountains("Maroon",54));
moun.add(new Mountains("KiKiano",34));
moun.add(new Mountains("najuko",567));
moun.add(new Mountains("sakura",12));
moun.add(new Mountains("saske",90));
System.out.println("user intered :\n "+moun);
moun.sort((one , two) -> one.name.compareTo(two.name));
System.out.println("by name :\n "+moun);
moun.sort((one,two) -> two.height - one.height);
System.out.println("by height :\n "+moun);
}
}
class Mountains{
String name;
int height;

Mountains(String a,int b){
name= a;
height = b;
}
public String toString(){
return name+ " "+height;
}
}