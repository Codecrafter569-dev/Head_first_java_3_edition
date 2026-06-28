import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Stream2{
 public static void main(String args[]){
List<String> coffees = List.of("Cappuccino","Americano"
,"Espresso","Cortado",
"Mocha","Cappuccino","Flat White","Latte");
List<String> ca = coffees.stream()
                         .filter(s -> s.endsWith("o"))
                         .sorted()
                         .distinct()
                         .collect(Collectors.toList());

System.out.println(ca);

 }

}