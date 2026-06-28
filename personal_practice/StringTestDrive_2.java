import java.util.Scanner;
public class StringTestDrive_2{
	public static void main(String[] args) {
		String greeting = "Hello";
		greeting = greeting.substring(0,3)+"p!";
		System.out.println(greeting);
		new StringTestDrive_2().go();
	}
	public void go(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a password :");
      String name = sc.nextLine();

      if(name.equals("Vikash")){
      	System.out.println("Password mached");
      }else{
      	System.out.println("Wrond password");
      }
      //methods for ignoring case in String during compareing.
      System.out.println("Hello".equalsIgnoreCase("hello"));

      //if String are empty
      String str = null;
      if(str == null){
      	System.out.println("This is a String and null");
      }else{
      	System.out.println("Your String are not null");
      }

      str = "";
      if(str != null && str.length() ==0 ){
      	System.out.println("This is a empty String");
      }else{
      	System.out.println("This is not a empty");
      }

	}
	
}