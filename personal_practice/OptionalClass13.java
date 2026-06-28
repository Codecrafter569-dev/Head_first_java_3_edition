import java.util.*;
import java.util.stream.*;


public class OptionalClass13{
public static void main(String args[]){

Optional<String> name = Optional.of("john");

name.ifPresentOrElse(
System.out::println,
() -> System.out.println("name not present")


);



}
}