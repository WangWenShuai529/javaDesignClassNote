package Car;

public class E260Factory implements BenzFactory{

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
    

    @Override
    public void createCar() {
        System.out.println("BenzE260:createCar");
        
    }
    
}
