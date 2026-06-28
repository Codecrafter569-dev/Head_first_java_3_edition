import java.util.Scanner;
public class Strings{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
//declaretion type non primitive like this
String name = new String("Vikash Kumar");
System.out.println("your name is :"+name);
//input 
System.out.println("enter your name :");
String name1 = sc.nextLine();

System.out.println("you are enter :"+name1);
//concatition
String names1 = "vikash ";
String names2 = "kumar";
String fullname = names1+names2;
System.out.println(fullname);

//Length of a Strings
System.out.println(fullname.length());


//access characters of Strings
for(int i = 0; i < fullname.length();i++){
System.out.print(fullname.charAt(i)+" ");
}

//substring
System.out.println();
System.out.println(fullname.substring(0,6));
System.out.println(fullname.substring(7));
System.out.println(fullname.substring(3,8));

//replace
System.out.println(fullname.replace('k','t'));

//comparition

//s2 > s3 return +value
//s2 == s3 return 0value
//s2 < s3 return -value


String name2 = "hello";
String name3 = "hello";

System.out.println(name2.compareTo(name3));

if(name2.compareTo(name3) == 0 ){
System.out.println("Strings are equals");
}else if (name2.compareTo(name3) > 0){
System.out.println(name2+"is biger then"+name3);
}else{

System.out.println(name2+" is smaller then  "+name3 );
}
}
}