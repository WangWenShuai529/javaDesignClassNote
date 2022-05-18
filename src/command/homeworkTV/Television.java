package command.homeworkTV;
//接收者
public class Television {
	public void open(String name) {
		System.out.println("打开电视"+name);
	}

    public void close(String name) {
		System.out.println("关闭电视"+name);
    }

    public void changeChannel(String name) {
		System.out.println("换台"+name);
    }
}