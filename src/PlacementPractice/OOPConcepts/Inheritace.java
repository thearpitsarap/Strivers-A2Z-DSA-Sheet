package PlacementPractice.OOPConcepts;

abstract class Vehicle{
    private long speed;
    private int engineCapacity;
    private int fuelCapacity;

    Vehicle(){}

    Vehicle(long speed,int engineCapacity,int fuelCapacity){
        this.speed=speed;
        this.engineCapacity=engineCapacity;
        this.fuelCapacity=fuelCapacity;
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public abstract void display();

    @Override
    public String toString() {
        return "speed=" + speed + ", engineCapacity=" + engineCapacity + ", fuelCapacity=" + fuelCapacity;
    }
}

class Car extends Vehicle{
    private int doors;
    private int wheels;

    Car(){}

    Car(long speed,int engineCapacity,int fuelCapacity,int doors,int wheels){
        super(speed,engineCapacity,fuelCapacity);
        this.doors=doors;
        this.wheels=wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void display(){
        System.out.println("Car is moving");
    }

    @Override
    public String toString() {
        return "Car ["+ super.toString() +"doors=" + doors + ", wheels=" + wheels + "]";
    }
    
}

class Bike extends Vehicle{
    private int wheels;

    Bike(){}

    Bike(long speed,int engineCapacity,int fuelCapacity,int wheels){
        super(speed,engineCapacity,fuelCapacity);
        this.wheels=wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void display(){
        System.out.println("Bike is moving");
    }

    @Override
    public String toString() {
        return "Bike [" + super.toString() + "wheels= " + wheels + "]";
    }
}

public class Inheritace {
    public static void main(String[] args) {
        Vehicle bike = new Bike(100,250,15,2);
        System.out.println(bike);
        Vehicle car = new Car(200,1500,30,4,4);
        System.out.println(car);
    }
}