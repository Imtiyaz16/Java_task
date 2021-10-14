package lab_exercise_unit_2;

public class bitWiseOperator_2_1_2 {
	public static void main(String[] args) {
		System.out.println("===========================");
		
		 // Initial values
       int a = 5;
       int b = 7;

       // bitwise and
       // 0101 & 0111=0101 = 5
       System.out.println("a&b = " + (a & b));

       // bitwise or
       // 0101 | 0111=0111 = 7
       System.out.println("a|b = " + (a | b));

       // bitwise -XOR
       // 0101 ^ 0111=0010 = 2
       System.out.println("a^b = " + (a ^ b));

       // bitwise not
       // ~0101=1010
       // will give 2's complement of 1010 = -6
       System.out.println("~a = " + ~a);

       // can also be combined with
       // assignment operator to provide shorthand
       // assignment
       // a=a & b
       a &= b;
       System.out.println("a= " + a);

	}
}
