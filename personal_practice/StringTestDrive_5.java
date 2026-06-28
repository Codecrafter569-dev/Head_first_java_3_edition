public class StringTestDrive_5{
	public static void main(String[] args) {
		String name = "Vikash Kumar";
		char cp = name.charAt(5);
		System.out.println(cp);
		int cp1 = name.codePointAt(2);
		System.out.println(cp1);
		cp1 = name.offsetByCodePoints(0,3);
		System.out.println(cp1);
		cp1 = name.compareTo("Hello");
		System.out.println(cp1);
		int[] cp2 = name.codePoints().toArray();
	     for(int c : cp2){
	     	System.out.print(c+" ");
	     }

	     String cpp2 = new String(cp2,0,2);
	     System.out.println(cpp2);
	     System.out.println("".isEmpty());
	     System.out.println(" ".isBlank());
	     System.out.println("Hello".equals("Hello"));
	     System.out.println("Hello".equalsIgnoreCase("helLo"));
	     System.out.println(name.indexOf("K"));
	     System.out.println(name.indexOf("m",4));
	     System.out.println(name.startsWith("V"));
	     System.out.println(name.endsWith("r"));
	     System.out.println(name.indexOf(105));
	     System.out.println(name.indexOf(32,0));
	     System.out.println(name.lastIndexOf("s"));
	     System.out.println(name.lastIndexOf("k",10));
	     System.out.println(name.lastIndexOf(75));
	     System.out.println(name.lastIndexOf(114,11));
	     System.out.println(name.length());
	     System.out.println(name.codePointCount(3,12));
	     System.out.println(name.replace('V','T'));
	     System.out.println(name.substring(4));
	     System.out.println(name.substring(3,8));
	     System.out.println(name.toLowerCase());
	     System.out.println(name.toUpperCase());
	     System.out.println(name.strip());
	     System.out.println(name.stripLeading());
	     System.out.println(name.stripTrailing());
	     System.out.println("Hello".join(" ","Java","Python","C++","C#","Css"));
	     System.out.println(name.repeat(6));




	}
	
}