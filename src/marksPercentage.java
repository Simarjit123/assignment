
public class marksPercentage  {

	public static void main(String[] args) {
		int math, science, operatingsystems, datawarehouse;
		double total, Percentage;

		math = 75;
		science = 55;
		operatingsystems = 80;
		datawarehouse = 75;

		total = math + science + operatingsystems + datawarehouse;
		Percentage = (total / 400) * 100;

		System.out.println(" total marks  " + total);

		System.out.println(" Marks Percentage =  " + Percentage);
	}
}
