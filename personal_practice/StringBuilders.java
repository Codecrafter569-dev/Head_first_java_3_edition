public class StringBuilders{
public static void main(String args[]){
//stringBuilder declaration
StringBuilder sb = new StringBuilder("Vikash");
System.out.println(sb);


//get a character from index
System.out.println(sb.charAt(0));

//set a character at index
sb.setCharAt(0,'K');
System.out.println(sb);

//Insert a character at some index 
sb.insert(0,'G');
System.out.println(sb);

//Delete a character at some index
sb.delete(0,1);
System.out.println(sb);

//Append a character from the string of last Index.
sb.setCharAt(0,'V');
sb.append("Kumar");
System.out.println(sb);

for(int i = 0; i <sb.length()/2;i++){
int front = i;
int back = sb.length() - 1 - i;
char frontChar = sb.charAt(front);
char backChar = sb.charAt(back); 
sb.setCharAt(front,backChar);
sb.setCharAt(back,frontChar);
}
System.out.println(sb);
}
}