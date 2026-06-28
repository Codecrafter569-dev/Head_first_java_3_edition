public class EnumeratedTestDrive{
	public static void main(String[] args) {
		enum Size {SMALL,MEDIUM,LARGE,EXTRA_LARGE};
		Size s = Size.SMALL;
		System.out.println(s);
	}
}