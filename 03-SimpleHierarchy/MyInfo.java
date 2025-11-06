// public class MyInfo {
//     public static void main(String[] args) {
//         Car myCar = new Car("Bugatti");
//         myCar.start();
//         myCar.drive();
//     }
// }

// class Vehicle {
//     private String brand;

//     public Vehicle(String brand) {
//         this.brand = brand;
//     }
    
//     public void start() {
//         System.out.println(brand + " is starting...");
//     }

//     public String getBrand() {
//         return brand;
//     }
// }

// class Car extends Vehicle {
//     public Car(String brand) {
//         super(brand);
//     }
    
//     void drive() {
//         System.out.println(getBrand() + " is driving on the road");
//     }
// }

public class MyInfo {
    public static void main(String[] args) {
    Car car = new Car();
    car.setBrand("Bugatti");
    car.start();
    car.drive();
}}
class Vehicle {
    private String brand;

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return this.brand;
    }

    void start() {
        System.out.println(this.brand + " is starting...");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println(this.getBrand() + " is driving on the road");
    }
}