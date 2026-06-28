import java.util.Scanner;
public class BitwiseTestDrive{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fout = (n&0b1000)/0b1000;
		System.out.println(fout);
		System.out.println((n&(1<<3))>>3);
		System.out.println(33&2);
	}
	
}