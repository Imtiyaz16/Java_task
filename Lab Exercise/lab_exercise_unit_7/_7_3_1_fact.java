package lab_exercise_unit_7;

public class _7_3_1_fact{
	int fact (int n){
		if (n <= 1) 
			return 1;
		else 
			return n*fact(n-1) ;
	}
	public static void main (String arg [ ])
	{
		int fact_a, fact_b, fact_c;
		int a = 4, b = 5, c = 6;
		_7_3_1_fact f;
		f = new _7_3_1_fact ( );
		fact_a = f.fact (a);
		fact_b =f.fact (b);
		fact_c = f.fact (c);
		System.out.println("Factorial of "+ a + " is " + fact_a);
		System.out.println ("Factorial of "+ b + " is "+ fact_b);
		System.out.println("Factorial of "+ c + " is "+ fact_c);
}
}