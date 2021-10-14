package lab_exercise_unit_2;

public class _2_5_3_Starpattern {
	static int a=5;
	public static void main(String args[]) {
		for(int i=1;i<=6;i++) {
			for(int j=a;j<=5;j++) {
				System.out.print(j);
				
			}
			System.out.println();
			a--;
		}
	}
}
