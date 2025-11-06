public class MyInfo {
    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer("Sony");
        cdPlayer.connect();
        cdPlayer.info();
        cdPlayer.play();
        
        System.out.println();
        
        Smartphone smartphone = new Smartphone("Samsung");
        smartphone.connect();
        smartphone.info();
        smartphone.play();
    }
}

// Interface
interface Playable {
    void play();
}

// Abstract Class
abstract class MusicDevice {
    String brand;
    
    public MusicDevice(String brand) {
        this.brand = brand;
    }
    
    public void info() {
        System.out.println("Music player brand: " + brand);
    }
    
    abstract void connect();
}

// CDPlayer Class
class CDPlayer extends MusicDevice implements Playable {
    public CDPlayer(String brand) {
        super(brand);
    }
    
    public void connect() {
        System.out.println("Connecting CD disc...");
    }
    
    public void play() {
        System.out.println("Playing music from CD");
    }
}

// Smartphone Class
class Smartphone extends MusicDevice implements Playable {
    public Smartphone(String brand) {
        super(brand);
    }
    
    public void connect() {
        System.out.println("Connecting via Bluetooth...");
    }
    
    public void play() {
        System.out.println("Playing music from Spotify");
    }
}
