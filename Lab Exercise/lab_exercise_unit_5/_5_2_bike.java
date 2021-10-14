package lab_exercise_unit_5;

abstract class _5_2_bike {
	 abstract void run();  
		}  
		class Honda4 extends _5_2_bike{  
		void run(){
			System.out.println("running safely");
		} 
	public static void main(String args[]) {
		_5_2_bike obj = new Honda4();  
		 obj.run();  
	}
}

