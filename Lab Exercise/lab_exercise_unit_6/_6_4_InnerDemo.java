package lab_exercise_unit_6;

class Outer{
String so = ("I am Outer Class");
void display()
{
System.out.println(so);
}
void test(){
Inner inner = new Inner();
inner.display();
}
class Inner{
String si =("I am inner Class");
void display(){
System.out.println(si);
}
}
}
class _6_4_InnerDemo{
public static void main(String args[]){
Outer outer = new Outer();
outer.display();
outer.test();
}

}
