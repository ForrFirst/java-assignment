public class MyInfo {
    public static void main(String[] args) {
        Car myCar = new Car("Bugatti");
        myCar.start();
        myCar.drive();
    }
}

class Vehicle {
    private String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public void start() {
        System.out.println(brand + " is starting...");
    }

    public String getBrand() {
        return brand;
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    
    public void drive() {
        System.out.println(getBrand() + " is driving on the road");
    }
}