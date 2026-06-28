import java.util.Scanner;
public class BitMipulation{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
//get bit 
int n = 5; //0101
int pos = 1;//constant is posstion .
int bitMask = 1<<pos;
if((bitMask & n) == 1){
System.out.println("bit was 1 is "+"posstion "+pos);

}else{
System.out.println("bit was 0 is posstion "+pos);

}

//set Bit
int newBitMask =( bitMask | n );
System.out.println("the value of a before set 1 is "+n +" and after set 1 "+newBitMask);

//clear Bit

int pos1 = 2;
int bitMask1 = 1<<pos1;
int not = ~(bitMask1);
int Mask1 = not & n;
System.out.println("the value of a before set 0 is "+n +" and after set 0 "+Mask1  );

//update bit

System.out.println("enter 0 ,1 to update bit :");
int user = sc.nextInt(); //if user is 1 means set bit else user is 0 means clear bit
int n1 = 5; //0101
int pos2 = 1;
int bitMask12 = 1<<pos2;
if(user == 1 ){
int newMask34 = (bitMask12  | n1);
System.out.println(newMask34);
}else{
int pos22 = 2;
int bitMask121 = 1<<pos22;
int not11 = ~(bitMask121);
int bitMask23 = not11 & n1;
System.out.println(bitMask23);

}

}
}