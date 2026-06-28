/**
 * This is the My second program
 * and this a comment for ganrating a documantion
 * @Version 1.01.33 8694-854-172
 * @author Vikash kumar(CodCreafer).
 **/
import java.util.Scanner;
public class MySecondProgram{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//this is comments
		/*
          This is a many lines of comments
          look a that it is so good
          What is for best for you 
          and me.

		*/
		System.out.print("Enter a Name :");
		String name = sc.nextLine();

		System.out.println(name+" Ok you are a good programmer but you are a java programmer am i right");

		//this is binary from to print in console
		// binary to numbers and you can us a capital B to reprsent a binary.
		System.out.println(0b10101011001);

		// and this is for Hexadecimal
		System.out.println(0xCAFE);

		// and this method for printing a Ocatl numbers using 0 and numbers in binary.
		System.out.println(010001001111);

		//you can use a underscores to good format like that 547384_5738473_578374
		// and denote one million,
		//but the java compiler simply remove them
		System.out.println(1637_6791);
		System.out.println(58983593839l);
		System.out.println(8969.1f);
		System.out.println(6749.6841d);
		//An E or e denotes a decimal exponent. For example, 1.729E3 is the same as 1729
		System.out.println(5.7593E3);

		System.out.println(0x1.0p-6);
		System.out.println(2.0-1.1);
		System.out.println(0xa);
		//This is a unike sacape sequance
		System.out.println('\u005B');
		
	}
	
}