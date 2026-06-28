public class BottleSong{
public static void main(String args[]){
int bottleNum = 10;
String words = "bottles";
while(bottleNum >= 0){
if(bottleNum == 1){
words = "bottle";//singular,as in one bottle
}
System.out.println(bottleNum+" green "+words+",hanging on the wall");
System.out.println(bottleNum+" green "+ words+",hanging on the wall");
System.out.println("and if one green bottle should accidentally");
bottleNum --;
if (bottleNum >0){
System.out.println("There '11 be "+bottleNum+" green "+" ,hanging on the wall");
}else{
System.out.println("There ,11 be no green bottles ,hanging on the wall");
}
}
}
}

