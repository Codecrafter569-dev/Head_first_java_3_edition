@FunctionalInterface
 interface Alpha{
 void mathod1(int a);
}
@FunctionalInterface
interface Runnable{
void run();
}
@FunctionalInterface
interface Comsumer<T>{
void accept(T a);
}
@FunctionalInterface
interface Comparator<T> {
String compare(int o1 , int o2);
}

public class Lambda1{
public static void main(String args[]){
Alpha a = (age) -> {
 System.out.println("Functional Interface using print age = "+age);
};
//callint the Functional Mathod
a.mathod1(7192);

Runnable r = () -> System.out.println("Hello Lambda Exprestion");
r.run();
Comsumer<String> c = str -> System.out.println(str);
c.accept("Vikash Kumar");

Comparator<Integer> ca = (int a1,int b1) ->{
if( a1 < b1 ){
return b1+"<"+a1;
}else if( a1 == b1 ){
return "equal";
}else{
return b1+">"+a1;
}
};
 String str1 = ca.compare(12,12);
System.out.println(str1);
}

}