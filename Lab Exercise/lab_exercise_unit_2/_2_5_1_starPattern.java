package lab_exercise_unit_2;

public class _2_5_1_starPattern {
	public static void main(String []args){
		
		System.out.println("1");
		for(int i=1;i<5;i++) {
			System.out.print("1 ");	
			int t=2*i-1;
			while(t>0) {
				System.out.print("0 ");
				t--;
			}
			System.out.println("1 ");
		}
	}
}
