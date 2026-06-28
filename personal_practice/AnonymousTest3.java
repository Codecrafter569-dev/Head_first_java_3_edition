class Calculator{
int calculate(int a, int b){
return a + b;

}	
int calculate(int a, int b ,int c){
return a+b+c;
}	
}

public class AnonymousTest3{
public static void main(String args[]){
Calculator anonymousCalculator = new Calculator(){
	@Override
	int calculate(int a, int b){
	return a*b;	
	}
	@Override
	int calculate(int a, int b, int c){
		
		return a*b*c;
	}
};
System.out.println(anonymousCalculator.calculate(5,10));
System.out.println(anonymousCalculator.calculate(12,56,78));
}

}