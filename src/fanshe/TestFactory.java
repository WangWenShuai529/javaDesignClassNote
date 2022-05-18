package fanshe;

import Order.main;
import javafx.scene.control.TreeView;

public class TestFactory {
    public static void main(String[] args) {
        
    }
}

abstract class TV{
    public abstract void play();
}

class Haier extends TV{

    @Override
    public void play() {
        System.out.println("heier     play!!!!");
        
    }

}

abstract class TVFactory{
    public abstract TV producTv();
}