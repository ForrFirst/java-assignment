public class MyInfo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Bugatti");
        myCar.setSpeed(999);
        myCar.displayInfo();
    }
}

class Car {
    private String brand;
    private int speed;

    public void setBrand(String newBrand){
        brand = newBrand;
    }

    public void setSpeed(int newSpeed){
        if(newSpeed > 0){
            speed = newSpeed;
        } else {
            System.out.println("Speed must be greater than 0");
        }
    }

    public String getBrand(){
        return brand;
    }
    public int getSpeed(){
        return speed;
    }

    public void displayInfo(){
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
} 
