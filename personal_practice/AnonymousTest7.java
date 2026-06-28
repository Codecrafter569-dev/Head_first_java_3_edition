class Container<T>{
	T value;
	Container(T value){
	this.value = value;	
	}
	T getValue(){
	return value;	
	}
}



public class AnonymousTest7{
public static void main(String args[]){
Container<Integer> anonymousContainer = new Container<>(83893){
	
};
 int value = anonymousContainer.getValue();
 System.out.println(value);
}

}