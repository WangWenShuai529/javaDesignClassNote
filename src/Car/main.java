package Car;

public class main {
    
    public static void main(String[] args) {
        // 生产BenzC180
        BenzFactory c180  = new C180Factory();
        c180.carColor();
        c180.carPrice();
        c180.carSpeed();
        c180.createCar();
        System.out.println("============================");
        // 生产BenzE260
        BenzFactory e260  = new E260Factory();
        e260.carColor();
        e260.carPrice();
        e260.carSpeed();
        e260.createCar();

        
    }
}
