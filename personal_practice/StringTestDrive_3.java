public class StringTestDrive_3{
	public static void main(String[] args) {
		String greeting = "Hello";
		int n = greeting.length();
		System.out.println(n);

		int cpCount = greeting.codePointCount(3,greeting.length());
		System.out.println(cpCount);
		int index = greeting.offsetByCodePoints(0,4);
        int i = 3;
		System.out.println(index);
		int cp = greeting.codePointAt(index);
		System.out.println(cp);
		cp = greeting.codePointAt(i);
		if(Character.isSupplementaryCodePoint(cp)) i += 2;
		else i++;
		System.out.println(cp);

		new StringTestDrive_3().go();
	}
	public void go(){
		String name = "Vikash kumar";
		for(int i=0;i<name.length();i++){
			char chars = name.charAt(i);
			System.out.print(chars+" ");
		}
		System.out.println();

		testString();
	}
	public void testString(){
		String name = "Parwati Devi";
		int i = name.length()-;
		i--;
		if(Character.isSurrogate(name.charAt(i)))i--;
		int cp = name.codePointAt(i);
		System.out.println(cp);

	}
	
	
}