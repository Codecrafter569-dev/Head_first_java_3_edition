public class ConstansTestDrive{
	public static final int SCOREMULTIPLES = 45;
	public static void main(String[] args) {
		new ConstansTestDrive().constants();
	}
	public void constants(){
         double currentscores = 578;
         System.out.println("This is a my score with multiple of 45 :"+currentscores*SCOREMULTIPLES);
	}
}