package lab_exercise_unit_4;

class Animal{  
	void eat()
	{
		System.out.println("eating...");
	}  
}  
class Dog extends Animal{  
	void bark()
	{
		System.out.println("barking...");
		}  
}  
class _4_3_Employee{  
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.bark();  
		d.eat();  
}}  
