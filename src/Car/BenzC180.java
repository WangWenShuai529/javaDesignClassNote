package Car;

public class BenzC180 implements Benz {

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
    
}
