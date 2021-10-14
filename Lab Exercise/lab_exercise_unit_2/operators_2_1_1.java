package lab_exercise_unit_2;

public class operators_2_1_1 {
	public static void main(String[] args) {
//		increment operator
		System.out.println("increment Operator:");

		int i=20,b=2;
		System.out.println("Value of a before increment "+i);
		
		int i1= ++b + b++ + --b; ///(i++) is equivalent to i+=1
		System.out.println("Value of a after increment "+i1);
		
//		decrement Operator
		System.out.println("decrement Operator:");
		int j=20;
		System.out.println("Value of i before decrement "+j);

		j--;
		System.out.println("Value of i after decrement "+j);
		
		
	}
}
