import java.util.Scanner;
public class SwitchTestDrive{

	public static void main(String[] args) {
		int x = 34;
		int y = 22;
		System.out.println(y > x ? x : y+" ,x is "+x+" y is "+y);
		Scanner sc = new Scanner(System.in);
		int seasonCode = sc.nextInt();

		String seasonName = switch(seasonCode){
		case 0 -> "Spring";
		case 1 -> "Summer";
		case 2 -> "Fall";
		case 3 -> "Winter";
		default -> "???";

		};
		System.out.println(seasonName);

		int numLetters = switch(seasonName){
		case "Spring","Summer","Winter" -> 6;
		case "Fall"->4;
		default -> -1;
		};
		System.out.println(numLetters);
		new SwitchTestDrive().go();

	}
	public void go(){
		enum Size {SMALL,MEDIUM,LARGE,EXTRA_LARGE};
		Size itemSize =Size.MEDIUM;

		String label = switch(itemSize){
		case SMALL -> "S";
		case MEDIUM -> "M";
		case LARGE -> "L";
		case EXTRA_LARGE -> "XL";
		//default -> "LLLLoLL";
		};
		System.out.println(label);

	}
	
}