package lab_exercise_unit_16;





public class _16_3_ extends Thread
{
private int delay;
_16_3_ (String name, float seconds)
{
super (name);
delay = (int) seconds * 1000;// delays are in milliseconds
start(); // start up ourself!
}
public void run ( )
{
while (true)
{
System.out.println (Thread.currentThread ( ).getName ( ) );
try
{
Thread.sleep (delay);
}
catch (InterruptedException e)
{
return ;
}
}
}
public static void main (String argc[ ])
{

new _16_3_ ("one potato", 1.1F);
new _16_3_ ("two potato", 1.3F);
new _16_3_ ("three potato", 0.5F);
new _16_3_ ("four", 0.7F);
}
}

