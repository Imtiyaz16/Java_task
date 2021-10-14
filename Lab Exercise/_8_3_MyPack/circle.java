package _8_3_MyPack;


class Circle{
	double r;
	void area(){
		System.out.println("Area of the circle = " + (3.14 * r * r));
	}
}
class Square{
	double s;
	void area(){
		System.out.println("Area of the Square = " + (s * s));
	}
}
class Rectangle{
	double l,b;
	void area(){
		System.out.println("Area of the circle = " + (l * b));
	}
}
class Eg{
	public static void main(String a[]){
		Circle c = new Circle();
		c.area();
	}
}