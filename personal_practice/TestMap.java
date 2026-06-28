import java.util.Map;
import java.util.HashMap;
public class TestMap{
public static void main(String args[]){
 new TestMap().go();
}
public void go(){
Map<String,Integer> maplist = new HashMap<>();
maplist.put("Hello",5);
maplist.put("Gello",45);
maplist.put("Kittu",34);
maplist.put("Gama",123);
maplist.put("Dalta",567);
System.out.println(maplist);

System.out.println(maplist.get("Gama"));
}
}