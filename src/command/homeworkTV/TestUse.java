package command.homeworkTV;
public class TestUse {
	public static void main(String args[]) throws Exception{
		//接收者
		Television rec = new Television();
		//命令
		TVOpenCommand createA = new TVOpenCommand(rec);
		TVCloseCommand createB = new TVCloseCommand(rec);
		TVChangeCommand createC = new TVChangeCommand(rec);
		//请求者
		Controller client = new Controller(createA, createB, createC);
		//执行命令
		client.open("海信");
		client.changeChannel("换cctv1");
		client.changeChannel("换cctv9");
		client.close("海信");
		

		//执行命令
		client.open("长虹");
		client.changeChannel("换cctv1");
		client.changeChannel("换cctv9");
		client.close("长虹");
	}
}