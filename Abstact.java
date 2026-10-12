abstract class Vehicle
{
    abstract void start();
}
class car extends Vehicle
{
    void start()
    {
        System.out.println("Cars starts with key");
    }
}
class bike extends Vehicle
{
    void start()
    {
        System.out.println("Bike starts with kick");
    }
}
public class Main
{
	public static void main(String[] args) {
		Vehicle v=new car();
		v.start();
		v=new bike();
		v.start();
	}
}
