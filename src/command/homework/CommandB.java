package command.homework;
//block命令
public class CommandB implements Command {
	Receiver peopleReceiver;
	public CommandB(Receiver peopleReceiver) {
		this.peopleReceiver = peopleReceiver;
	}
	@Override
	public void execute(String name) throws Exception {
		peopleReceiver.block(name);
	}
}
