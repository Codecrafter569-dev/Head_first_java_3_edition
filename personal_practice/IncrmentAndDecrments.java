public class IncrmentAndDecrments{
	public static void main(String[] args) {
		int n = 12;
		int a = 45;
		int a1 = 45;
		int b = 9;
		n++;
		System.out.println(n);
		n = 2*++a;
		System.out.println(n);
		b = 2*a1++;
		System.out.println(b);
		int num = 1;
		for (int x = 1;x < 50;x++) {
			int num1 = num++;
			System.out.println("This is a value of Num:"+num);
			System.out.println("This is a value of Num2:"+num1);



		}


	}
	
}