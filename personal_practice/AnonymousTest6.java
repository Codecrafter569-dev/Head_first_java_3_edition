interface Printable{
void print();	
}

public class AnonymousTest6{
public static void main(String args[]){
Printable anonymousPrinter = () -> System.out.println("Printer by anonymousPrinter");
anonymousPrinter.print();
}

}