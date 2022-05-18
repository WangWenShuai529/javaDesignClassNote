package Car;

public class BenzE260 implements Benz {

    @Override
    public void carColor() {
        System.out.println("BenzE260:carColor:blue");
        
    }

    @Override
    public void carSpeed() {
        System.out.println("BenzE260:carSpeed:120km/h");
        
    }

    @Override
    public void carPrice() {
        System.out.println("BenzE260:carPrice:1,000,000");
        
    }
    
}
