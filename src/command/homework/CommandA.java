package command.homework;
//进攻命令
public class CommandA implements Command {
	Receiver peopleReceiver;
	public CommandA(Receiver peopleReceiver) {
		this.peopleReceiver = peopleReceiver;
	}
	@Override
	public void execute(String name) throws Exception {
		peopleReceiver.attack(name);
	}
}
