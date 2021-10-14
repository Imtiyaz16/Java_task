package lab_exercise_unit_4;

public class _4_4_vehicle {
	void run(){
		System.out.println("Vehicle is running");}  
		}  

class Bike extends _4_4_vehicle{  
	
	void run(){
	System.out.println("Bike is running safely");
	}  
	public static void main(String args[]) {
		Bike obj=new Bike();
		obj.run();
		
	}
}
