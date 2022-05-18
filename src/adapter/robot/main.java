package adapter.robot;

public class main {

  public static void main(String[] args) {
        Dog dog =new Dog();
        Robot dogRobot = new DogAdapter(dog);

        dogRobot.cry();
         dogRobot.move();
    }
}
