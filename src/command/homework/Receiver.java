package command.homework;
//接收者
public class Receiver {
	public void attack(String name) {
		System.out.println(name+"进攻");
	}

    public void block(String name) {
		System.out.println(name+"堵击");
    }

    public void fakeAttach(String name) {
		System.out.println(name+"佯攻");
    }
}