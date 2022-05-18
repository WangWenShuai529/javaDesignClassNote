package command.homework;
public class TestUse {
	public static void main(String args[]) throws Exception{
		//接收者
		Receiver rec = new Receiver();
		//命令
		CommandA createA = new CommandA(rec);
		CommandB createB = new CommandB(rec);
		CommandC createC = new CommandC(rec);
		//请求者
		Client client = new Client();
		//执行命令
		client.setCommand(createA).executeCommand("独立团");
		client.setCommand(createB).executeCommand("三团");
		client.setCommand(createC).executeCommand("独立营");
	}
}