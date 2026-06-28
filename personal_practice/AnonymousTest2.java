class Persion{
  Persion(String name){
     System.out.println("Hello, "+name);
  }	  
}

public class AnonymousTest2{
public static void main(String args[]){
Persion anonymousPersion = new Persion("Vikash"){
//AnonymousClass body
	
};
}

}