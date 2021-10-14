package lab_exercise_unit_7;


public class _7_3_2_fibo{
	long fibo (int n){
		if (n <= 1)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
	public static void main (String args [ ]){
	_7_3_2_fibo f;
	long l;
	f = new _7_3_2_fibo ( );
	l = f.fibo (5);
	System.out.println ("5th fibonacci number is "+l);

	}
	}
