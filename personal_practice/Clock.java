public class Clock{
public static void main(String args[]){
Foo f = new Foo();
f.setTime("12 : 54");
String th = f.getTime();
System.out.println("time->"+th);
}
}

class Foo {
String time;

void setTime(String t){
time = t;
}
String getTime(){
return time;
}
}