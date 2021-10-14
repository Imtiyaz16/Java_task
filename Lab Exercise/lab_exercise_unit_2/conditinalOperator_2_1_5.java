package lab_exercise_unit_2;

public class conditinalOperator_2_1_5 {
	public static void main(String[] args) {
		
		int x=5, y=4, z=7;  
		System.out.println(x>y && x>z || y<z);  
		System.out.println((x<z || y>z) && x<y);  
		
		
		System.out.println("Ternary Operator");
		int a, b;  
		a = 20;  
		b = (a == 1) ? 61: 90;  
		System.out.println("Value of b is: " +  b);  
		b = (a == 20) ? 61: 90;  
		System.out.println("Value of b is: " + b);  
	}
}
