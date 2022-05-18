package Car;

public class C180Factory implements BenzFactory{

    @Override
    public void carColor() {
        System.out.println("BenzC180:carColor:red");
        
    }

    @Override
    public void carSpeed() {
        System.out.println("BenzC180:carSpeed:100km/h");
        
    }

    @Override
    public void carPrice() {
        System.out.println("BenzC180:carPrice:500,000");
        
    }

    @Override
    public void createCar() {
        System.out.println("BenzC180:createCar");
        
    }
    
}
