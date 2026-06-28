import  java.util.*;
import java.util.stream.*;
public class OptionalClass{
public static void main(String args[]){
List<String> names = Arrays.asList("John","Alice","Bob");

Optional<String> longestName = names.stream()
                                    .max(Comparator.comparingInt(String::length));
longestName.ifPresent(System.out::println);
new OptionalTest().go();
}

}

class OptionalTest{
public void go(){
	// Creating an Optional with a non-null value
Optional<String> optional = Optional.of("Hello");

// Creating an Optional with a null value
Optional<String> optionalNullable = Optional.ofNullable(null);
if(optionalNullable.isPresent()){
System.out.println("Value is Present");	
}else{
System.out.println("Value is not Present");	
}
if(optional.isPresent()){
System.out.println("Value is Present");	
}else{
System.out.println("Value is not Present");	
}
String value = optional.get();
System.out.println(value);
String defaultValue = optionalNullable.orElse("Default Value");
System.out.println(defaultValue);
// Throws RuntimeException
//String value1 = optionalNullable.orElseThrow(() -> new RuntimeException("Value not found"));
optional.ifPresent(System.out::println);
Optional<String> mappedOptional = optional.map(String::toUpperCase);
System.out.println(mappedOptional.get());

Optional<String> filteredOptional = optional.filter(s -> s.length() > 5);
filteredOptional.ifPresent(System.out::println);

}	
}
