public class StringTestDrive_4{
	public static void main(String[] args) {
		String str = "Hello, how i can help you to get a more formal";
		int[] codePoints = str.codePoints().toArray();
		for(int code :codePoints){
			System.out.print(code+" ");
		}
		System.out.println(codePoints);
		new StringTestDrive_4().go();
	}
	public void go(){
		String str = "a";
		int codepoints = str.codePointAt(0);
		System.out.println(codepoints);
		int cp = 0x1F37A;
		String cy = "0x1F37A";
		int codePoints = cy.codePointAt(0);
		System.out.println(codePoints);
		str = Character.toString(cp);
		System.out.println(str);
	}
	
}