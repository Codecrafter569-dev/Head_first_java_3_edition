public class Operators{
public static void main(String args[]){
int a = 23;
int b = 3;
//arithmatic operators
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);

//unary operators
//(a++ )-> post increment ,( a--)  -> post decrement.
//(++a)-> pre increment , (--a) -> pre decrement.

int num = 4;
int num1 = 0; 
num1 = num++;                       //num = num +1  ->num++;
System.out.println("\n"+num);//5
System.out.println(num1);//4

num1 = num--;
System.out.println("\n"+num);//4
System.out.println(num1);//5

num1 = ++num;
System.out.println("\n"+num);//5
System.out.println(num1);//5

num1 = --num;
System.out.println("\n"+num);//4
System.out.println(num1);//4

//assignment operators
//=
int g = 54;                  //g += h -> g = g+h;
int h = 56;
System.out.println(g = h);
//+=
System.out.println(g += h);
//-=
System.out.println(g -= h);
// /=
System.out.println(g /= h);
//*=
System.out.println(g *= h);
//%=
System.out.println(g %= h);

System.out.println();

//Relational operators
System.out.println(g  == h);
System.out.println(g < h);
System.out.println(g > h);
System.out.println(g <= h);
System.out.println(g >= h);
System.out.println(g != h);
//Logica operators
System.out.println( true && true);
System.out.println(false || true);
System.out.println(! (true && true));

//bitwise operators
int gh = 101101 & 10110;
System.out.println(gh);
gh = 56 | 45;
System.out.println(gh);
gh = 1010101^10101010;
System.out.println(gh);
gh = ~101010;
System.out.println(gh);
gh = 0101010 <<1;
System.out.println(gh);
gh = 010101 >>1;
System.out.println(gh);




}

}