public class VariablesTest{
	public static void main(String[] args) {
		double salary;
		int vacationDays;
		long earthPopulation;
		boolean done;
		salary = 561938.7003;
		vacationDays = 684910;
		earthPopulation = 8961247473963l;
		done = true;
		double valueForProgram = 67533.963584d;
		var age = 55;
		var name ="Vikash Kumar";
		var iD = 6757848478262l;
		System.out.println(age);
		System.out.println(name);
		System.out.println(iD);
		System.out.println(salary);
		System.out.println(vacationDays);
		System.out.println(earthPopulation);
		System.out.println(done);
		System.out.println(valueForProgram);
		new VariablesTest().go();
	}
	public void go(){
            final double CM_PER_INCH = 2.54;
            double paperWidth = 8.5;
            double paperHeight = 11;
            System.out.println("Paper size in centimeters: "+paperWidth*CM_PER_INCH+" by "+paperHeight*CM_PER_INCH);
	}
}