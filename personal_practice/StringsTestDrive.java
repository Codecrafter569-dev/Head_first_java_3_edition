public class StringsTestDrive{
	public static void main(String[] args) {
		String e = "";
		String greeting = "Hello";
		String languages = "Java\u2122";
		System.out.println(e);
		System.out.println(greeting);
		System.out.println(languages);
		//This is a substring mathod for get a String in any characters
		String s = greeting.substring(0,4);
		System.out.println(s);

		//concatenation
		String expletive = "Expletive";
		String del = " deleted";
		String message = expletive+del;
		System.out.println(message);
		int age = 34;
		String rating = "PG"+age;
		System.out.println(rating);
		//joing methods
		String all = String.join("/","S","M","L","XL");
		System.out.println(all);
		all = String.join(" ","Java","C++","Python","C#","C");
		System.out.println(all);

		//Repeating methods
		System.out.println("Java ".repeat(10));
	}
	
}