package adapter.robot;
//对象适配器
public class DogAdapter implements Robot{

	Dog dog;


	 public DogAdapter(Dog dog){ //取得要适配的对象的引用

 		this.dog = dog;
		
 }
	@Override
	public void cry() {

		dog.wang();
		  System.out.println("Robot cry");
	}

	@Override
	public void move() {
		dog.run();
		  System.out.println("Robot move");
	}
	
}