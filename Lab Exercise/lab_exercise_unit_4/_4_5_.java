package lab_exercise_unit_4;

class Animals{  
String color="white";  
}  
class Dogs extends Animals{  
String color="black";  
void printColor(){  
System.out.println(color);  
System.out.println(super.color);  
}  
}  
	public class _4_5_{
	public static void main(String args[]){  
		Dogs d=new Dogs();  
		d.printColor();  
		}
}



  
