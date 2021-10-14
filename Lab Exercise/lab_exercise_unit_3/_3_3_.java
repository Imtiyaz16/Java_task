package lab_exercise_unit_3;

public class _3_3_ {
	public void sum(int a, int b) { // call by reference.
		
		System.out.println(a+b);

	}
	public static void main(String[] args) {
		
		_3_3_ obj=new _3_3_();
		obj.sum(5, 2); //call by value.
		
	}

}
