
interface Printable{
void print();	
}
 public class AnonymousTest{
public static void main(String args[]){
Printable anonymousPrinter = new Printable(){
	@Override
	public void print(){
	System.out.println("this is anonymousPrinter class");	
	}
	
};
anonymousPrinter.print();
}

}