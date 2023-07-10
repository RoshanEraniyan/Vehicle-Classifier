abstract class Vehicle
{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle
{
    public void start()
    {
        System.out.println("Car is Started");
    }
    public void stop()
    {
        System.out.println("Car is Stopped");
    }
}
class Motorcycle extends Vehicle
{
    public void start()
    {
        System.out.println("MotorCycle is Started");
    }
    public void stop()
    {
        System.out.println("MotorCycle is Stopped");
    }
}
class VehicleClassifier
{
    public static void main(String[] args)
    {
        Car c =new Car();
        c.start();
        c.stop();
        Motorcycle m=new Motorcycle();
        m.start();
        m.stop();
    }
}