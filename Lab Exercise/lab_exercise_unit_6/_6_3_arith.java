package lab_exercise_unit_6;

public interface _6_3_arith{
	
	public int square(int a);

}

class arithmetic implements _6_3_arith{
	int s = 0;
	public int square(int b)
	{
		System.out.println("implemented method square");
		System.out.println("Square of " + "is "+s);
		return s;
	}
	void arithmeth()
	{

		System.out.println("Inside method of  Arithmetic class");
	}
}

// use the object
class Test
{
public static void main(String a[]){
	System.out.println("calling from ToTestInt "); 
	
	_6_3_arith t = new arithmetic();
t.square(10);
}
}
